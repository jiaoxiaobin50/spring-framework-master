package com.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @ClassName:springScan
 * @Descrition: proxyTargetClass=true 使用Gclib代理
 * @author: jiaoxiaobin
 * @date:2020/04/12 17:45<br/>
 * @version:V1.0
 */
@Configuration
@ComponentScan("com.app.demo")
// @ImportResource("classpath:spring.xml")
// @EnableAspectJAutoProxy
public class AppConfig {
}
