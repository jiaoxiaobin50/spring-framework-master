package com.app;

import sun.misc.Unsafe;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName:ReentractLockTest
 * @Descrition: TODO
 * @author: jiaoxiaobin
 * @date:2020/04/09 00:25<br/>
 * @version:V1.0
 */
public class ReentractLockTest {
	static ReentrantLock reentrantLock = new ReentrantLock(true);
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(){
			@Override
			public void run(){
				sync();
			}
		};
		Thread t2 = new Thread(){
			@Override
			public void run(){
				sync();
			}
		};

		t1.setName("t1");
		t1.start();
		t2.setName("t2");
		t2.start();
	}

	private static void sync(){
		Hashtable table = new Hashtable();
		table.put(null,null);
		table.get(null);
		HashSet set = new HashSet();
		set.add(null);
		reentrantLock.lock();
		reentrantLock.unlock();
	}

}
