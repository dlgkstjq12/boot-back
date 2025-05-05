# 1단계: 빌드
FROM openjdk:17-jdk-slim AS build
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# 2단계: 실행
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/boot-maple-back.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]