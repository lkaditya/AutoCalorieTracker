# For Java 8, try this
# FROM openjdk:8-jdk-alpine

FROM rappdw/docker-java-python:zulu11.43-python3.7.9
RUN java -version
RUN python --version
RUN pip install tensorflow
RUN pip install numpy
RUN pip install pillow

# For Java 11, try this
#FROM adoptopenjdk/openjdk11:alpine-jre


### 1. Get Linux
#FROM alpine:3.7

### 2. Get Java via the package manager
#RUN apk update \
#&& apk upgrade \
#&& apk add --no-cache bash \
#&& apk add --no-cache --virtual=build-dependencies unzip \
#&& apk add --no-cache curl \
#&& apk add --no-cache openjdk11-jre

#RUN apk add --no-cache python3 \
#&& python3 -m ensurepip \
#&& pip3 install --upgrade pip setuptools \
#&& rm -r /usr/lib/python*/ensurepip && \
#if [ ! -e /usr/bin/pip ]; then ln -s pip3 /usr/bin/pip ; fi && \
#if [[ ! -e /usr/bin/python ]]; then ln -sf /usr/bin/python3 /usr/bin/python; fi && \
#rm -r /root/.cache

### Get tensorflow for the app
#RUN pip install tensorflow

# Refer to Maven build -> finalName
ARG JAR_FILE=target/AutoCalorieTracker-0.0.1-SNAPSHOT.jar


# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar


COPY ${JAR_FILE} AutoCalorieTracker-0.0.1-SNAPSHOT.jar

COPY src/main/resources/model model

COPY src/main/resources/static/image image
#copy the python file as well


# java -jar /opt/app/app.jar    

CMD ["java","-jar","AutoCalorieTracker-0.0.1-SNAPSHOT.jar"]