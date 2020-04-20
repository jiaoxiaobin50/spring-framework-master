package org.com.jiao;

import org.springframework.stereotype.Component;

/**
 * @ClassName:IndexDao
 * @Descrition: TODO
 * @author: jiaoxiaobin
 * @date:2020/04/14 23:30<br/>
 * @version:V1.0
 */
@Component
public class IndexDao{
	public IndexDao() {
		System.out.println("init====");
	}
	public void test(){
		System.out.println("IndexDao  test=======");
	}

}
