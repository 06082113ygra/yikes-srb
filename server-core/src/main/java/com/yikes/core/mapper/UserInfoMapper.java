package com.yikes.core.mapper;

import com.yikes.core.pojo.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户基本信息 Mapper 接口
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
