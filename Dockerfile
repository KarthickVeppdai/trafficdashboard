FROM openjdk:17-jdk-slim
COPY target/trafficdashboard-0.0.1-SNAPSHOT.jar trafficdashboard-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "trafficdashboard-0.0.1-SNAPSHOT.jar"]
EXPOSE 8094