package test;

import org.com.jiao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName:TestJiao
 * @Descrition: TODO
 * @author: jiaoxiaobin
 * @date:2020/04/14 23:44<br/>
 * @version:V1.0
 */
public class TestJiao {
	public static void main(String[] args) {
		// 初始化环境各种BeanDefinition，工厂信息等
		// 在AnnotationConfigApplicationContext的父类
		// GenericApplicationContext的构造器中实例化了beanFactory
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext();

		// 注册，把一个class转成beanDefinition 最后put到map
		// 其实这里是将AppConfig注册而不是他的扫描到的类
		ac.register(AppConfig.class);
		// ac.addBeanFactoryPostProcessor(new JiaoBeanFactoryPostProcessor());

		// 实例化bean对象
		// ConfigurationClassParser.doProcessConfigurationClass这一步将包扫描到spring容器中
		ac.refresh();

		IndexDao dao = ac.getBean(IndexDao.class);
		dao.test();
	}
}
