package com.lzh.springBoot.mapper;


import com.lzh.springBoot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  用户持久层接口
 * Created by lzh
 */
@Mapper
public interface UserMapper {



    /**
     *  分页获取用户信息
     * @param phoneNumber
     * @param userName
     * @param limit
     * @param limitSize
     * @return
     */
    List<User> queryByPage(@Param("phoneNumber") String phoneNumber, @Param("userName") String userName,
                           @Param("limit") Integer limit, @Param("limitSize") Integer limitSize);


    /**
     *  通过ID 查询用户 部分字段(积分、余额、token、DeviceToken etc..)
     * @param id
     * @return
     */
    User queryUserById(@Param("id") Integer id);


    /**
     *  统计用户
     * @param phoneNumber
     * @param userName
     * @return
     */
    Integer countByPage(@Param("phoneNumber") String phoneNumber,@Param("userName") String userName);




    /**
     * 获取用户详情
     * @param id
     * @return
     */
    User getUserByIdForWeb(@Param("id") Integer id);




}
