package com.liangzi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liangzi.service.NoticeService;
import com.liangzi.util.BootstrapUIDataGridResult;

/**
 * 公告管理
 * @author wxdsg
 *
 */
@Controller
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/notice/list")
	@ResponseBody
	public BootstrapUIDataGridResult getNoticeList(Integer page, Integer rows) {
		BootstrapUIDataGridResult result = noticeService.getNoticeList(page, rows);
		return result;
	}
}
