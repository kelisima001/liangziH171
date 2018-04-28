package com.liangzi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liangzi.service.UserService;
import com.liangzi.util.BootstrapUIDataGridResult;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/list")
	@ResponseBody
	public BootstrapUIDataGridResult getUserInfoList(Integer page,Integer rows) {
		BootstrapUIDataGridResult list = userService.getUserInfoList(page, rows);
		return list;
	}
}
