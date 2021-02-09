FROM maven:3.6.3-openjdk-11
RUN mvn spring-boot:build-image