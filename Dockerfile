FROM eclipse-temurin:17
COPY target/city.jar city.jar
CMD [ "java","-jar", "city.jar" ]