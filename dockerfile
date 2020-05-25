FROM openjdk:8-jdk-alpine

COPY target/grpc-java-0.0.1-SNAPSHOT.jar grpc-java-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/grpc-java-0.0.1-SNAPSHOT.jar"]