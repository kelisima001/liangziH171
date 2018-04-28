package com.liangzi.service;

import com.liangzi.util.BootstrapUIDataGridResult;

public interface UserService {

	BootstrapUIDataGridResult getUserInfoList(Integer page,Integer rows);
}
