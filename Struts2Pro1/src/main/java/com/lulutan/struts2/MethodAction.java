package com.lulutan.struts2;/*
 *  @Author:shipeixin
 *  @Date:2019/6/29 14:57
 *
 */

import com.opensymphony.xwork2.ActionSupport;

public class MethodAction extends ActionSupport {

    public String add(){
        System.out.println("add");
        return null;
    }

    public String delete(){
        System.out.println("delete");
        return null;
    }

    public String update(){
        System.out.println("update");
        return null;
    }

    public String find(){
        System.out.println("find");
        return null;
    }
}
