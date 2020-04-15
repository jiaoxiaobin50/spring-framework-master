package test;

import org.com.jiao.IndexDao;
import org.com.jiao.IndexDaoImport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * Configuration 注解就是开启Cglib代理，如何判断，后面有个标记Full和lite，是否开启Cglib代理
 */
@Configuration
@ComponentScan("org.com.jiao")
// @Import(MyImportDemo.class)
@EnableAspectJAutoProxy
public class AppConfig {


	/**
	 * 加上@Configuration不会打印两次init，而没有加注解@Configuration，则会调用IndexDao两次
	 * @return
	 */

	@Bean
	public IndexDao indexDao(){
		return new IndexDao();
	}
	@Bean
	public IndexDaoImport indexDaoImport(){

		// 如果加了@Configuration注解，判断是不是第一次调用，
		// 如果第一次调用，则会new，如果不是第一次调用
		// 此处会根据增强对象的策略，拦截，从beanFactory中取
		indexDao();
		return new IndexDaoImport();
	}
}
