FROM amazoncorretto:17-alpine-jdk

COPY target/Spring-Servidor-REST-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar" , "/app.jar"]