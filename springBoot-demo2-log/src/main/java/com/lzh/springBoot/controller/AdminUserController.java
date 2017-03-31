package com.lzh.springBoot.controller;


import com.lzh.springBoot.bean.Page;
import com.lzh.springBoot.bean.User;
import com.lzh.springBoot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
/**
 *
 * 后台管理人员 控制器
 * Created by Eric Xie on 2017/2/15 0015.
 */

@Controller
@RequestMapping("/web/user")
public class AdminUserController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private UserService userService;




    /**
     *  分页获取 用户信息
     * @param phoneNumber 手机号
     * @param userName 用户名
     * @param pageNO 页码
     * @param pageSize 数量
     * @return
     */
    @RequestMapping("/getUsers")
    @ResponseBody
    public Page<User> getUsers(String phoneNumber, String userName, Integer pageNO, Integer pageSize){

        Page<User> data = userService.queryByWebPage(phoneNumber,userName,pageNO,pageSize);
        logger.info("info");
        logger.error("error");
        logger.debug("debug");
        return data;
    }






//    /**
//     * 退出登录
//     * @return
//     */
//    @RequestMapping("/logout")
//    public @ResponseBody ViewData logout(){
//        LoginHelper.clearToken();
//        return buildSuccessCodeJson(StatusConstant.SUCCESS_CODE,"退出成功");
//    }



    /***
     * 获取用户详情
     * @param id
     * @return
     */
    @RequestMapping("/queryUserById")
    @ResponseBody
    public User queryUserById(Integer id){
        try {
            return userService.getUserByIdForWeb(id);
        } catch (Exception e) {
            return null;
        }
    }



}
