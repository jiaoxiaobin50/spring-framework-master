package com.app;

import com.app.demo.annotation.UserAspectj;
import com.app.demo.dao.IndexDao;
import com.app.demo.dao.IndexDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName:TestMain
 * @Descrition: TODO
 * @author: jiaoxiaobin
 * @date:2020/04/12 17:43<br/>
 * @version:V1.0
 */
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao indexDao = ac.getBean(IndexDao.class);
		indexDao.testDao();
		System.out.println(indexDao.hashCode());
	}
}
