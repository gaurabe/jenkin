FROM openjdk:8
ADD target/jenkintest.jar jenkintest.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","jenkintest.jar"]