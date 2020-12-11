FROM openjdk:latest
COPY target/tech_exam-0.0.1-SNAPSHOT.jar /usr/src/snap.jar
CMD java -jar /usr/src/snap.jar
