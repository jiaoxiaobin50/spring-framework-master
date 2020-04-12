package com.app.demo.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName:IndexDaoImpl
 * @Descrition: TODO
 * @author: jiaoxiaobin
 * @date:2020/04/12 17:38<br/>
 * @version:V1.0
 */
@Component
@Scope("prototype")
public class IndexDaoImpl implements IndexDao, InitializingBean {
	public IndexDaoImpl() {
		System.out.println("construct");
	}

	public void testDao() {
		System.out.println("daoImpl");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
	}
}
