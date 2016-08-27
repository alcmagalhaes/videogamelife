FROM java:8
VOLUME /tmp
ADD vgcollection-microservice.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongodb/videogamelife_vgcollection", "-Djava.security.egd=file:/dev/./urandom", "-jar",	"/app.jar" ]
