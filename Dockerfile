FROM openjdk:17 as builder

# JDK 1.8 버전을 베이스로 설정한 후 builder로 alias 처리합니다.
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

# Spring Boot 프로젝트 내의 gradle 설정 파일과 소스코드를 이미지로 가져옵니다.
RUN chmod +x ./gradlew
RUN ./gradlew bootjar

FROM openjdk:17
COPY --from=builder build/libs/*.jar /ojy.jar

EXPOSE 9099

#ENTRYPOINT ["nohup","java", "-Djasypt.encryptor.password=${KEY}", "-jar", "/getto.jar", ">", "out.log", "2>&1","&"]
ENTRYPOINT exec java -jar -Dspring.profiles.active=dev /getto.jar
