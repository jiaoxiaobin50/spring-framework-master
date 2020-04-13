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

		// 实现了默认的jdk切面就报错,要是gclib就不会报错 @EnableAspectJAutoProxy(proxyTargetClass=true)
		// 因为生成了代理对象，和目标对象完全不一样，对目标对象进行了增强
		// IndexDao indexDao = ac.getBean(IndexDaoImpl.class);
		// indexDao.testDao();
	}
}
