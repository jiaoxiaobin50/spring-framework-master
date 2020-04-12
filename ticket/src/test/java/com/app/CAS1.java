package com.app;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @ClassName:CAS1
 * @Descrition: TODO
 * @author: jiaoxiaobin
 * @date:2020/04/04 23:45<br/>
 * @version:V1.0
 */
public class CAS1 {

	private AtomicInteger atomicInteger = new AtomicInteger(0);
	private AtomicStampedReference asf = new AtomicStampedReference(1, 1);

	private void increate2() {
		atomicInteger.compareAndSet(0, 1);
		System.out.println(atomicInteger.get());
		atomicInteger.incrementAndGet();
		System.out.println("第二次");
		System.out.println("第三次");
		System.out.println("第4次");
	}

	public static void main(String[] args) {
		System.out.println("ss");
	}
}
