package com.liangzi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liangzi.pojo.ZDepartManager;
import com.liangzi.service.DepartService;
import com.liangzi.util.BootstrapUIDataGridResult;

/**
 * ≤ø√≈Controller
 * @author wxdsg
 *
 */
@Controller
public class DepartController {

	@Autowired
	private DepartService departService;
	
	@RequestMapping("/depart/list")
	@ResponseBody
	public BootstrapUIDataGridResult getDepartInfoList(Integer page,Integer rows){
		
		BootstrapUIDataGridResult list = departService.getDepartInfoList(page,rows);
		return list;
	}
}
