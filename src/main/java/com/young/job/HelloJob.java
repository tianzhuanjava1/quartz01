package com.young.job;

import org.quartz.*;

import java.util.Date;

public class HelloJob implements Job{

    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDetail jobDetail = context.getJobDetail();
        JobKey key = jobDetail.getKey();
        System.out.println(key.getName());
        System.out.println(key.getGroup());
        System.out.println("hello job exec "+new Date());
    }
}
