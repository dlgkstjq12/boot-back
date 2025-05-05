# Java 17 기반 이미지
FROM openjdk:17-jdk-slim

# JAR 복사할 디렉토리 설정
WORKDIR /app

# 빌드된 jar 파일을 컨테이너로 복사
COPY target/boot-maple-back.jar app.jar

# 포트 열기 (Spring Boot 기본 포트)
EXPOSE 8080

# 앱 실행
CMD ["java", "-jar", "app.jar"]