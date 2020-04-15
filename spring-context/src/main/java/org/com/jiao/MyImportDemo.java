package org.com.jiao;

import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.annotation.Annotation;
import java.util.function.Predicate;

/**
 * @ClassName:MyImportDemo
 * @Descrition: 这种import可能不是长期存在，用了一段时间就关闭
 * @author: jiaoxiaobin
 * @date:2020/04/15 18:23<br/>
 * @version:V1.0
 */
public class MyImportDemo implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{IndexDaoImport.class.getName()};
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return null;
	}
}
