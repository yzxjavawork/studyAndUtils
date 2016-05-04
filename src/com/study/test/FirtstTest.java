package com.study.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

import org.junit.Test;

public class FirtstTest {
	
	@Test
	public void test(){
//		查看其他线程的试用情况
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		ThreadInfo[] dumpAllThreads = threadMXBean.dumpAllThreads(false, false);
		for (ThreadInfo threadInfo : dumpAllThreads) {
			System.out.println("【" + threadInfo.getThreadId()+"】 " +threadInfo.getThreadName());
		}
		
	}

}
