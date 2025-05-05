# 1. Java 17이 포함된 베이스 이미지 선택
FROM openjdk:17-jdk-slim

# 2. JAR 파일을 컨테이너에 복사
COPY target/boot-maple-back.jar /app.jar

# 3. JAR 파일 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]
