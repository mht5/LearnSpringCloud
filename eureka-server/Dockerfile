FROM java:8
VOLUME /tmp
ADD /target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
EXPOSE 1000
ENTRYPOINT ["java", "-jar", "eureka-server.jar", "-Dspring.application.name=test"]