FROM ubuntu:20.04
RUN apt-get update && apt-get install -y openjdk-17-jre
WORKDIR /app
COPY target/learspringboot-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-jar", "learspringboot-0.0.1-SNAPSHOT.jar"]