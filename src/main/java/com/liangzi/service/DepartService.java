package com.liangzi.service;

import java.util.List;

import com.liangzi.pojo.ZDepartManager;
import com.liangzi.util.BootstrapUIDataGridResult;

public interface DepartService {

	BootstrapUIDataGridResult getDepartInfoList(Integer page,Integer rows);
}
