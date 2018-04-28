package com.liangzi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liangzi.mapper.ZOrderMapper;
import com.liangzi.util.BootstrapUIDataGridResult;

/**
 * ¶©µ¥Service
 * @author wxdsg
 *
 */
@Service
public class OrderServiceImpl implements com.liangzi.service.OrderService {

	@Autowired
	private ZOrderMapper zOrderMapper;
	
	@Override
	public BootstrapUIDataGridResult getOrderList(Integer page,Integer rows) {
		
		PageHelper.startPage(page, rows);
		List<?> list=zOrderMapper.getOrderList();
		PageInfo<?> pageInfo=new PageInfo<>(list);
		BootstrapUIDataGridResult result=new BootstrapUIDataGridResult();
		result.setRows(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
