# 1단계: 빌드
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# .jar 이름 자동 탐지 및 복사
RUN find target -name "*.jar" -exec cp {} app.jar \;

# 2단계: 실행
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]