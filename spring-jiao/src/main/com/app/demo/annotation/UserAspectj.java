package com.app.demo.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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
	 * 	第一个*是表示方法的可见性 public、private等
	 * 	*.*类的方法 com.app.demo.dao.IndexDao.testDao
	 *  .. 代表参数
	 */
	@Pointcut("execution(* com.app.demo.dao.*.*(..))")
	public void pointCut(){
		System.out.println("pointCut ");
	}
	@Before("pointCut()")
	public void before(){
		System.out.println("before  ");
	}
	@After("pointCut()")
	public void after(){
		System.out.println("after  ");
	}

	@AfterReturning("pointCut()")
	public void afterReturning(){
		System.out.println("afterReturning  ");
	}
	@AfterThrowing("pointCut()")
	public void afterThrowing(){
		System.out.println("afterThrowing  ");
	}

	// @Pointcut("target(com.app.demo.dao.IndexDaoImpl)")
	// public void pointCutTarget(){
	// 	System.out.println("pointCutTarget ");
	// }
	// @Before("pointCutTarget()")
	// public void beforeThis(){
	// 	System.out.println("beforeTarget  ");
	// }
	// @After("pointCutTarget()")
	// public void afterThis(){
	// 	System.out.println("afterTarget  ");
	// }

	/**
	 * within粒度更大，表达式有点不一样
	 */
	@Pointcut("within(com.app.demo.dao.*)")
	public void pointCutWithin(){
		System.out.println("pointCutWithin ");
	}
	@Before("pointCutWithin()")
	public void beforeWithin(JoinPoint joinPoint){
		System.out.println("beforeWithin  ");
		// System.out.println("this:"+joinPoint.getThis());
		// System.out.println("target:"+joinPoint.getTarget());
	}
	@After("pointCutWithin()")
	public void afterWithin(){
		System.out.println("afterWithin  ");
	}

	@Around("pointCutWithin()")
	public void aroundWithin(ProceedingJoinPoint proceedingJoinPoint){
		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("aroundWithin  ");
	}



}
