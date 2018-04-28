package com.liangzi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liangzi.mapper.ZCustomerMapper;
import com.liangzi.pojo.ZCustomer;
import com.liangzi.service.CustomerService;
import com.liangzi.util.BootstrapUIDataGridResult;

/**
 * 客户service
 * @author wxdsg
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private ZCustomerMapper zCustomerMapper;
	
	public BootstrapUIDataGridResult getCustomerList(Integer page,Integer rows) {
		// 分页插件
		PageHelper.startPage(page, rows);
		List<ZCustomer> list = zCustomerMapper.getCustomerList();
		//分页
		PageInfo<?> pageInfo=new PageInfo<>(list);
		BootstrapUIDataGridResult result=new BootstrapUIDataGridResult();
		result.setRows(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
