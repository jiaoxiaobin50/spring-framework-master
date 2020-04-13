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
public class IndexDaoImpl implements IndexDao{
	public void testDao() {
		System.out.println("daoImpl");
	}
}
