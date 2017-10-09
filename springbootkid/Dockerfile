FROM java:8
ADD target/starter-hello-world-1.0-SNAPSHOT.jar /installations/starter-hello-world.jar
RUN chmod 700 /installations/starter-hello-world.jar
ENTRYPOINT ["java","-Xms512m","-Xmx512m","-jar","/installations/starter-hello-world.jar"]
