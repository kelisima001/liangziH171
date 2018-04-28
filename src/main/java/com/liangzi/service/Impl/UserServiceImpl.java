package com.liangzi.service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liangzi.mapper.TEmployeeMapper;
import com.liangzi.pojo.TEmployee;
import com.liangzi.pojo.TEmployeeExample;
import com.liangzi.service.UserService;
import com.liangzi.util.BootstrapUIDataGridResult;

/**
 * �û�����
 * @author wxdsg
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TEmployeeMapper employeeMapper;
	
	public BootstrapUIDataGridResult getUserInfoList(Integer page, Integer rows) {
		
		//��ҳ����
		PageHelper.startPage(page, rows);
		//ִ�в�ѯ
		TEmployeeExample example=new TEmployeeExample();
		List<TEmployee> list = employeeMapper.selectByExample(example);
		//ȡ��ҳ��Ϣ
		PageInfo<TEmployee> pageInfo=new PageInfo<>(list);
		BootstrapUIDataGridResult result=new BootstrapUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
//		System.out.println(result);
		return result;
	}

}
