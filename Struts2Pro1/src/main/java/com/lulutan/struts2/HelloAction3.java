package com.lulutan.struts2;/*
 *  @Author:shipeixin
 *  @Date:2019/6/29 14:48
 *
 */

import com.opensymphony.xwork2.ActionSupport;
    //  继承ActionSupport
public class HelloAction3 extends ActionSupport {

    public String execute(){
        System.out.println("来到hello3");
        return SUCCESS;
    }
}
