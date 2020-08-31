## Introduction:
API provides a way to query how many trips a particular cab (medallion) has made given pickup date.
The API receives one or more medallions as input and return number of trips each medallion has made in given pickup date.


## Build Instructions:
1. Extract/checkout project from repository
2. Update database url in application.yml by replacing hostname, port and database_name in url as: 		jdbc:mysql://[hostname]:[port]/[database_name]
3. Update username/password in application.yml, make sure that this user has "SELECT" privilege for above database
4. Goto home folder and build the project using command: 'mvn clean spring-boot:run' from the command prompt or IDE. It will build and start the application ready to accept requests from client
   Alternatively, Application.java file can be run from IDE once maven build is successful.

## References:
Maven Setup: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
