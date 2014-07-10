package com.zuidaima.tasklet;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;

public class DailyTask {

	private Scheduler scheduler;
	private CronTrigger taskOneCronTrigger;
	private JobDetail taskOneJobDetail;

	public void execue() throws SchedulerException {
		System.out.println("Start taskOneCronTrigger in DailyTask "
				+ Thread.currentThread().getName());
		scheduler.addJob(taskOneJobDetail, true);
		scheduler.scheduleJob(taskOneCronTrigger);
	}

	public Scheduler getScheduler() {
		return scheduler;
	}

	public void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
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

}