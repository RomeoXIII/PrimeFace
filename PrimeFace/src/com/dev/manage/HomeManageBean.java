package com.dev.manage;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "homeManage", eager = true)
public class HomeManageBean {
	public HomeManageBean() {
		System.out.println("HomeManageBean started!");
	}

	public String getMessage() {
		return "getMessage : TEST JSF";
	}
}
