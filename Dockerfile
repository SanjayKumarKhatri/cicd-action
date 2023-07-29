FROM openjdk:17
EXPOSE 8080
ADD target/springboot-image-new springboot-image-new
ENTRYPOINT ["java","-jar","/springboot-image-new.jar"]