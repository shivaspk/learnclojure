FROM openjdk:11.0-jre-slim

COPY target/uberjar/ring-app-0.1.0-SNAPSHOT-standalone.jar app.jar

EXPOSE 3000

CMD ["java", "-jar", "app.jar"]
