package com.liangzi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liangzi.mapper.TSystemDeptMapper;
import com.liangzi.mapper.ZDepartManagerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liangzi.pojo.TSystemDept;
import com.liangzi.pojo.TSystemDeptExample;
import com.liangzi.pojo.ZDepartManager;
import com.liangzi.service.DepartService;
import com.liangzi.util.BootstrapUIDataGridResult;
/**
 * 部门service
 * @author wxdsg
 *
 */
@Service
public class DepartServiceImpl implements DepartService {

	@Autowired
	private TSystemDeptMapper systemDeptMapper;
	
	@Override
	public BootstrapUIDataGridResult getDepartInfoList(Integer page,Integer rows) {
		// 
		/*DepartinfoExample example=new DepartinfoExample();*/
		//分页处理
		PageHelper.startPage(page, rows);
		TSystemDeptExample example=new TSystemDeptExample();
		List<TSystemDept> list = systemDeptMapper.selectByExample(example);
		//取分页信息
		PageInfo<?> pageInfo=new PageInfo<>(list);
		BootstrapUIDataGridResult result=new BootstrapUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

}
