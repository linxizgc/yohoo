package com.yohoo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

/**
 * Created by kaikentule on 2019/6/4.
 */
@Configuration
public class TestClass1 implements SchedulingConfigurer {

    private static Logger logger = LoggerFactory.getLogger(TestClass1.class);

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.setScheduler(Executors.newScheduledThreadPool(5));
    }
}
