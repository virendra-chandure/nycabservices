## Introduction:
API provides a way to query how many trips a particular cab (medallion) has made given pickup date.
The API receives one or more medallions as input and return number of trips each medallion has made in given pickup date.
The API allow user to ask for fresh data, ignoring the cache and method to clear the cache.


## Build Instructions:
1. Extract/checkout project from repository in any folder having full access to logged in user.
2. To change the database configuration, go to extracted folder and open file "src/main/resources/application.yml" where database url can be updated by replacing hostname, port and database_name in given url as: 		jdbc:mysql://[hostname]:[port]/[database_name]
3. Also update username/password in application.yml, make sure that this user has "SELECT" privilege for above database.
4. To build/run the application, go to extracted folder and execute command: "mvn clean spring-boot:run" from the command prompt. It will build and start the application ready to accept requests from client.
   Alternatively, Application.java file can be run from IDE once maven build is successful.
5. Cache settings can be tweak in configutation file: "src/main/resources/ehcache.xml"

## References:
Maven Setup: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
