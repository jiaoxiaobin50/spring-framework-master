package com.app.demo.service;

import com.app.demo.dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName:IndexServiceImpl
 * @Descrition: TODO
 * @author: jiaoxiaobin
 * @date:2020/04/12 17:39<br/>
 * @version:V1.0
 */
@Service
@Scope("prototype")
public class IndexServiceImpl implements IndexService{

	@Autowired
	private IndexDao indexDao;

	public void testService() {
		indexDao.testDao();
		System.out.println(indexDao.hashCode());
	}
}
