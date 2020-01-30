FROM openjdk:8-jdk-alpine
COPY target/TestKerjaEnigma-0.0.2-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]