package com.bjedrzejewski.tasklistservice;


import com.test.compensating.operation.aspect.PerformanceMetricsAspect;
import io.dropwizard.setup.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@Configuration
//@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableLoadTimeWeaving(aspectjWeaving = EnableLoadTimeWeaving.AspectJWeaving.ENABLED)
//@EnableSpringConfigured
@ComponentScan(basePackages="com.test.compensating.operation.aspect")
public class SpringConfiguration {
    

    @Autowired
    private Environment environment;

    @Bean
    public PerformanceMetricsAspect performanceMetricsAspect() {
        return new PerformanceMetricsAspect();
    }
}
