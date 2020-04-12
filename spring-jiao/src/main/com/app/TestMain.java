package com.app;

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
		// IndexServiceImpl service = (IndexServiceImpl) ac.getBean("indexServiceImpl");
		// service.testService();
		// System.out.println("s0"+service.hashCode());
		// IndexServiceImpl service1 = (IndexServiceImpl) ac.getBean("indexServiceImpl");
		// service.testService();
		// System.out.println("s1:"+service1.hashCode());
		ac.getBean(IndexDaoImpl.class);
	}
}
