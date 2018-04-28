package com.liangzi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liangzi.service.MessionService;
import com.liangzi.util.BootstrapUIDataGridResult;

/**
 * ÈÎÎñcontroller
 * @author wxdsg
 *
 */
@Controller
public class MessionController {

	@Autowired
	private MessionService messionService;
	
	@RequestMapping("/mession/list")
	@ResponseBody
	public BootstrapUIDataGridResult getMessionList(Integer page, Integer rows) {
		BootstrapUIDataGridResult result = messionService.getMessionList(page, rows);
		return result;
	}
}
