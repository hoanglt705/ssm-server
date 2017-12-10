FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ./target/ssm-spring-boot-service-1.0-SNAPSHOT.jar ssm-spring-boot-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ssm-spring-boot-service.jar"]
