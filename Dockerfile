FROM openjdk:latest
COPY target/projectblabla-1.0-SNAPSHOT.jar /usr/src/snap.jar
CMD java -jar /usr/src/snap.jar
