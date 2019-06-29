package com.lulutan.struts2;/*
 *  @Author:shipeixin
 *  @Date:2019/6/29 14:45
 *
 */

import com.opensymphony.xwork2.Action;
  //实现Action接口
public class HelloAction2 implements Action {

    @Override
    public String execute() throws Exception {
        System.out.println("来到hello2");
        return SUCCESS;
    }
}
