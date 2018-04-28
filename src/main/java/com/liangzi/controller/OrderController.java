package com.liangzi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liangzi.service.OrderService;
import com.liangzi.util.BootstrapUIDataGridResult;

/**
 * ¶©µ¥controller
 * @author wxdsg
 *
 */
@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/order/list")
	@ResponseBody
	public BootstrapUIDataGridResult getOrderList(Integer page,Integer rows) {
		BootstrapUIDataGridResult result = orderService.getOrderList(page, rows);
		return result;
	}
}
