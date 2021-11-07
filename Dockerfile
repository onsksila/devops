FROM ubuntu:latest
RUN apt-get update 
RUN apt-get -y upgrade
RUN DEBIAN_FRONTEND=noninteractive apt-get -y install mysql-client openjdk-8-jdk mysql-server apache2
ADD target/Timesheet-spring-boot-core-data-jpa-mvc-REST-1-0.0.1-SNAPSHOT.war Timesheet-DOCKER-IMAGE.war
EXPOSE 8082
COPY ./script.sh /
RUN chmod +x /script.sh
