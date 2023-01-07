package com.example.lotaproject.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class SchedulerJob {

    @Scheduled(fixedRate = 5000, initialDelay = 1000)
    public void scheduleFixedDelay(){

        System.out.println("time schedule running at every 1 second " + Calendar.getInstance().getTime());
    }

    @Scheduled(cron = "0 * 9 * * ?")
    public void cronJobSch() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        System.out.println("Java cron job expression:: " + strDate);
    }

}
