package com.liangzi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liangzi.mapper.ZMessionMapper;
import com.liangzi.pojo.ZSystemMession;
import com.liangzi.service.MessionService;
import com.liangzi.util.BootstrapUIDataGridResult;
/**
 * ����service
 * @author wxdsg
 *
 */
@Service
public class MessionServiceImpl implements MessionService {

	@Autowired
	private ZMessionMapper zMessionMapper;
	
	@Override
	public BootstrapUIDataGridResult getMessionList(Integer page, Integer rows) {
		// ��ҳ���
		PageHelper.startPage(page, rows);
		List<ZSystemMession> list = zMessionMapper.getMessionList();
		//��ҳ
		PageInfo<?> pageInfo=new PageInfo<>(list);
		BootstrapUIDataGridResult result=new BootstrapUIDataGridResult();
		result.setRows(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
