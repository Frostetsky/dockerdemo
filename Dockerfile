FROM openjdk:11
LABEL maintainer="nesterenko-nikita@bk.ru"
EXPOSE 8081
ADD target/dockerdemo-0.0.1-SNAPSHOT.jar springbootdemodocker.jar
ENTRYPOINT ["java", "-jar", "springbootdemodocker.jar"]