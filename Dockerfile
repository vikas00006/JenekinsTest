#FROM openjdk:21
#ADD build/libs/*.jar demo-docker.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","demo-docker.jar"]

FROM openjdk:21
COPY build/libs/*.jar demo-docker.jar
CMD java -jar demo-docker.jar