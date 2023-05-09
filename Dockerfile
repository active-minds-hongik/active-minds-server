FROM openjdk:17
EXPOSE 8080
COPY ./build/libs/*.jar app.jar

ARG PROFILE=prod
ENV PROFILE=${PROFILE}

ENTRYPOINT ["java","-jar","-Duser.timezone=Asia/Seoul","-Dspring.profiles.active=${PROFILE}","/app.jar"]