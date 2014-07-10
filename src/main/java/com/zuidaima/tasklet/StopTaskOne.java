package com.zuidaima.tasklet;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class StopTaskOne implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	private Scheduler scheduler;
	private CronTrigger taskOneCronTrigger;
	private JobDetail taskOneJobDetail;

	public void execue() throws SchedulerException {
		System.out.println("Stop Task One in "
				+ Thread.currentThread().getName());
		scheduler = (Scheduler) this.applicationContext.getBean("scheduler");
		scheduler.unscheduleJob(taskOneCronTrigger.getName(),
				taskOneCronTrigger.getGroup());
	}

	public CronTrigger getTaskOneCronTrigger() {
		return taskOneCronTrigger;
	}

	public void setTaskOneCronTrigger(CronTrigger taskOneCronTrigger) {
		this.taskOneCronTrigger = taskOneCronTrigger;
	}

	public JobDetail getTaskOneJobDetail() {
		return taskOneJobDetail;
	}

	public void setTaskOneJobDetail(JobDetail taskOneJobDetail) {
		this.taskOneJobDetail = taskOneJobDetail;
	}

	public Scheduler getScheduler() {
		return scheduler;
	}

	public void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}
}