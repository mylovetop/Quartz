package com.zuidaima.tasklet;

import org.quartz.SchedulerException;

public class TaskOne {

	public void execue() throws SchedulerException {
		System.out.println("Hello Spring Schedule!"
				+ Thread.currentThread().getName());
	}

}