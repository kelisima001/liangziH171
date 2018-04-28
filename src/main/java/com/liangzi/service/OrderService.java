package com.liangzi.service;

import com.liangzi.util.BootstrapUIDataGridResult;

/**
 * 
 * @author wxdsg
 *
 */
public interface OrderService {

	BootstrapUIDataGridResult getOrderList(Integer page,Integer rows);
}
