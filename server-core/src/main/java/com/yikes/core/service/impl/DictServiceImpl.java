package com.yikes.core.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yikes.base.util.BeanSuperUtil;
import com.yikes.common.enums.BaseExceptionEnum;
import com.yikes.common.exception.CommonException;
import com.yikes.common.utils.As;
import com.yikes.core.model.req.DictAddReq;
import com.yikes.core.model.req.DictEditReq;
import com.yikes.core.model.vo.DictVO;
import com.yikes.core.pojo.entity.Dict;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.DictMapper;
import com.yikes.core.service.DictService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@Service("dictService")
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {


    @Override
    public List<DictVO> listInfo() {

        return this.getChildrenNode(0L);
    }

    @Override
    public List<DictVO> listByParentId(Long parentId) {

        return this.getChildrenNode(parentId);
    }

    @Override
    public void add(DictAddReq req) {

        Dict dict = getById(req.getParentId());
        As.isNotNull(dict, CommonException.build(BaseExceptionEnum.PARENTID_DATA_NOT_EXIST));

        save(BeanSuperUtil.convert(req, Dict.class));
    }

    @Override
    public void edit(DictEditReq req) {

        Dict dict = getById(req.getId());
        As.isNotNull(dict, CommonException.build(BaseExceptionEnum.DATA_NOT_EXIST));

        updateById(BeanSuperUtil.convert(req, Dict.class));
    }

    @Override
    public void removeDictChild(Long id) {

        // 储存所有要删除的 id
        List<Long> idList = new ArrayList<>();

        // 添加删除的节点id
        this.selectChildListById(id, idList);

        // 添加删除的节点id
        idList.add(id);

        // MybatisPlus批量删除方法
        this.removeBatchByIds(idList);
    }

    @Override
    public void getTreeDict() {

        List<Dict> list = this.list();
        List<DictVO> dictVOList = BeanSuperUtil.convertList(list, DictVO.class);

        // 筛选根节点
        List<DictVO> voList = dictVOList.stream().filter(vo -> 0L == vo.getParentId()).peek(
                // 设置子节点信息
                vo -> vo.setChild(getChildrens(vo, dictVOList))
        ).collect(Collectors.toList());
    }

    // 查询子节点
    private List<DictVO> getChildrens(DictVO dictVO, List<DictVO> dictVOList) {

        List<DictVO> list = dictVOList.stream().filter(dict -> Objects.equals(dict.getParentId(), dictVO.getId())).map(dict -> {
            dict.setChild(this.getChildrens(dict, dictVOList));
            return dict;
        }).collect(Collectors.toList());

        return list;
    }


    /**
     * 递归获取子节点下的子节点
     * @param parentId  父id
     * @return
     */
    private List<DictVO> getChildrenNode(Long parentId) {

        List<DictVO> newTrees = new ArrayList<>();

        // 通过 parentId 来查询列表
        List<Dict> dictList = this.list(new LambdaQueryWrapper<Dict>().eq(Dict::getParentId, parentId));
        List<DictVO> convertList = BeanSuperUtil.convertList(dictList, DictVO.class);

        for (DictVO dictVO : convertList) {
            List<DictVO> news = getChildrenNode(dictVO.getId());
            if (!CollUtil.isEmpty(news) && news.size() != 0) {
                dictVO.setChild(news);
            }
            newTrees.add(dictVO);
        }
        return newTrees;
    }

    /**
     *
     * @param id  父id
     * @param idList  储存所有要删除的 id
     */
    private void selectChildListById(Long id, List<Long> idList) {

        // 查询数据库pid等于id的数据
        List<Dict> list = this.list(new LambdaQueryWrapper<Dict>().eq(Dict::getParentId, id));

        // 递归查询下一级id,同时将上一次查询结果添加到list集合
        for (Dict dict : list) {
            idList.add(dict.getId());
            selectChildListById(dict.getId(), idList);
        }
    }

}