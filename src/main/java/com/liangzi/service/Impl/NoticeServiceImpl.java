package com.liangzi.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liangzi.mapper.ZNoticeListMapper;
import com.liangzi.pojo.ZNoticeList;
import com.liangzi.service.NoticeService;
import com.liangzi.util.BootstrapUIDataGridResult;

/**
 * 公告Service
 * @author wxdsg
 *
 */
@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private ZNoticeListMapper zNoticeListMapper;
	
	@Override
	public BootstrapUIDataGridResult getNoticeList(Integer page, Integer rows) {
		//分页处理
		PageHelper.startPage(page, rows);
		//执行查询
		/*TSystemNoticeExample example=new TSystemNoticeExample();*/
		
		List<ZNoticeList> list = zNoticeListMapper.getNoticeList();
		//取分页信息
		PageInfo<?> pageInfo=new PageInfo<>(list);
		BootstrapUIDataGridResult result=new BootstrapUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
//				System.out.println(result);
		return result;
	}

}
