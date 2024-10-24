FROM eclipse-temurin:21

USER root

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ["chmod", "+x", "mvnw"]
RUN ./mvnw -e -B dependency:resolve

COPY src ./src
RUN ./mvnw clean -e -B package -DskipTests

EXPOSE 10120

CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.profiles=dev"]
