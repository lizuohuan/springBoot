package com.lzh.springBoot.service;


import com.lzh.springBoot.bean.Page;
import com.lzh.springBoot.bean.User;
import com.lzh.springBoot.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * 用户管理 业务层
 * Created by lzh
 */

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;



    /**
     *  web端 分页条件查询用户信息
     * @param phoneNumber 电话号码
     * @param userName 用户名
     * @param pageNO 页码
     * @param pageSize 页数
     * @return
     */
    public Page<User> queryByWebPage(String phoneNumber, String userName, Integer pageNO, Integer pageSize){
        List<User> users = userMapper.queryByPage(phoneNumber,userName,(pageNO - 1) * pageSize,pageSize);
        Integer count = userMapper.countByPage(phoneNumber,userName);
        Integer totalPage = count % pageSize == 0 ? count / pageSize : count / pageSize + 1;
        return new Page<User>(users,count,totalPage);
    }



    public User queryUserById(Integer id){
        return userMapper.queryUserById(id);
    }


    /**
     * 获取用户详情
     * @param id
     * @return
     */
    public User getUserByIdForWeb(Integer id) {
        return userMapper.getUserByIdForWeb(id);
    }
}

