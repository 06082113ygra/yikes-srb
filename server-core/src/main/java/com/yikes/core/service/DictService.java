package com.yikes.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yikes.core.model.req.DictAddReq;
import com.yikes.core.model.req.DictEditReq;
import com.yikes.core.model.req.DictPageReq;
import com.yikes.core.model.vo.DictVO;
import com.yikes.core.pojo.entity.Dict;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * 数据字典
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
public interface DictService extends IService<Dict> {

    /**
     * 数据字典-list
     * @return
     */
    List<DictVO> listInfo();

    /**
     * 根据上级id获取子节点数据列表
     * @param parentId
     * @return
     */
    List<DictVO> listByParentId(Long parentId);

    /**
     * 新增
     * @param req
     */
    void add(DictAddReq req);

    /**
     * 编辑
     * @param req
     */
    void edit(DictEditReq req);

    /**
     * 根据id ==>> 删除当前一条数据及其子数据
     * @param id
     */
    void removeDictChild(Long id);

    /**
     * 数据字典-无数据返回
     */
    void getTreeDict();

    /**
     * Excel数据的导出
     * @param req
     * @param response
     */
    void export(HttpServletResponse response);
}

