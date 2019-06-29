package com.lulutan.struts2;/*
 *  @Author:shipeixin
 *  @Date:2019/6/29 13:58
 *
 */

//   普通的pojo类
public class HelloAction {

    public String execute(){
        System.out.println("接收到请求");
        return "success";
    }


    public String test1(){
        System.out.println("来到test1");
        return "test1";
    }

}
