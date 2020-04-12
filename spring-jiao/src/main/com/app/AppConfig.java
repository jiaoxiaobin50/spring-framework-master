package com.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName:springScan
 * @Descrition: TODO
 * @author: jiaoxiaobin
 * @date:2020/04/12 17:45<br/>
 * @version:V1.0
 */
@Configuration
@ComponentScan("com.app")
// @ImportResource("classpath:spring.xml")
public class AppConfig {
}
