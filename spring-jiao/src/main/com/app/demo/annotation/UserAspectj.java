package com.app.demo.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName:UserAspectj
 * @Descrition: 切面
 * @author: jiaoxiaobin
 * @date:2020/04/13 15:00<br/>
 * @version:V1.0
 */
@Component
@Aspect
public class UserAspectj {

	/**
	 * 	切点的声明
	 */
	@Pointcut("execution(* com.app.demo.dao.*.*(..))")
	public void pointCut(){
		System.out.println("pointCut ");
	}

	/**
	 *
	 */
	@Before("pointCut()")
	public void before(){
		System.out.println("before  ");
	}
}
