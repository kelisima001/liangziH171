package com.liangzi.service;

import com.liangzi.util.BootstrapUIDataGridResult;

public interface NoticeService {

	BootstrapUIDataGridResult getNoticeList(Integer page,Integer rows);
}
