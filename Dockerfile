FROM maven:3.6.3-openjdk-11
RUN  mvn spring-boot:build-image -Dspring-boot.build-image.imageName=xhermesx/hello