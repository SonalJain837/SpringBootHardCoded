FROM maven:3.8.3-jdk-11 as maven
COPY ./pom.xml ./pom.xml
RUN mvn dependency:go-offline -B
COPY ./src ./src
RUN mvn package -DskipTests
FROM openjdk:11-jdk
WORKDIR /my-project
COPY --from=maven target/SpringBootRestApIHardcoded-0.0.1-SNAPSHOT.jar ./
EXPOSE 8001
CMD ["java", "-jar", "./SpringBootRestApIHardcoded-0.0.1-SNAPSHOT.jar"]