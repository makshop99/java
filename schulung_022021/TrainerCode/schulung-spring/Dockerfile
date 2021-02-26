#FROM openjdk:11
#COPY target/spring-0.0.1-SNAPSHOT.jar /app.jar
#VOLUME /src
#ENTRYPOINT ["java", "-jar", "/app.jar"]


# docker build . -t myproject
FROM maven:3.6.3-openjdk-11 AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src

WORKDIR /build/
RUN mvn clean package -DskipTests

FROM openjdk:11
COPY --from=MAVEN_BUILD /build/target/spring-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
