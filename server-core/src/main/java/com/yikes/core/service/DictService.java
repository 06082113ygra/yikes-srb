package com.yikes.core.service;

import com.yikes.common.exception.CommonException;
import com.yikes.common.result.Result;
import com.yikes.core.pojo.dto.ExcelDictDTO;
import com.yikes.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yikes.core.pojo.vo.DictVO;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
public interface DictService extends IService<Dict> {

    /**
     * 根据上级id获取子节点数据列表
     * @param parentId
     * @return
     */
    List<DictVO> listByParentId(Long parentId);

    /**
     * Excel批量导入数据字典
     * @param file
     * @return
     */
    Result<CommonException> importData(MultipartFile file);

    /**
     * Excel数据导出
     * @param response
     */
    void export(HttpServletResponse response);

}
