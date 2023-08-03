package com;

import com.entity.UserBean;

import javax.xml.ws.RequestWrapper;

public class JsonController {
    //页面打印json
//    @RequestMapping(value="/json1",
//            produces={"application/json; charset=UTF-8"})
//    public @ResponseBody UserBean printJson(){
//        UserBean userBean=new UserBean();
//        userBean.setName("Hill");
//        userBean.setAge(15);
//        return userBean;
//
//    }
//
//    //先接收接送然后页面打印json
//    @RequestMapping(value="/json2",
//            produces={"application/json; charset=UTF-8"})
//    public @ResponseBody UserBean printJson(@ResponseBody UserBean bean){
//        UserBean userBean=new UserBean();
//        userBean.setName("Bill");
//        userBean.setAge(19);
//        return bean;
}
