package com.liangzi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liangzi.service.CustomerService;
import com.liangzi.util.BootstrapUIDataGridResult;

/**
 * ¿Í»§Controller
 * @author wxdsg
 *
 */
@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customer/list")
	@ResponseBody
	public BootstrapUIDataGridResult getCustomerList(Integer page,Integer rows) {
		
		BootstrapUIDataGridResult result = customerService.getCustomerList(page, rows);
		return result;
		
	}
}
