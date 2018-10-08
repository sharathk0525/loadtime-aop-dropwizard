# loadtime-aop-dropwizard
loadtime-aop-with-dropwizard

This project contains 3 modules
a. tasklist-service - a micro-service using dropwizard which has 2 dependencies
     i. service-provider -- a service provider which has few business operations, would like to calculate pocessing time for my business            methods
      ii. calculate-metrics -- which has cross-cutting concern logic

I am having difficulty in writing around advice for my business methods,
also added as VM options
-javaagent:C:/dev/aspect-jars/aspectj-weaver.jar -javaagent:C:/dev/aspect-jars/spring-instrument-4.3.3.RELEASE.jar
