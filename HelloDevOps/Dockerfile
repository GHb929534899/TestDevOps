FROM sapmachine/jdk8:latest
MAINTAINER chen
ADD TestDevOps/HelloDevOps/target/HelloDevOps-1.0-SNAPSHOT.jar /TestDevOps/HelloDevOps.jar
VOLUME /opt
ENTRYPOINT ["java","-jar","/TestDevOps/HelloDevOps.jar","&"]