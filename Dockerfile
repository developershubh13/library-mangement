FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
ADD target/library1-management.jar library1-management.jar
ENTRYPOINT ["java","-jar","/library1-management.jar"]