FROM eclipse-temurin:17
COPY target/webappwithjenkins.jar webappwithjenkins.jar
CMD [ "java","-jar","webappwithjenkins.jar" ]