package com.liangzi.service;

import com.liangzi.util.BootstrapUIDataGridResult;

public interface CustomerService {

	BootstrapUIDataGridResult getCustomerList(Integer page,Integer rows);
}
