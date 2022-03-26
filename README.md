# springboot-swaggerui
swaggerui implementation

Swagger Ui is very useful when it comes to share the API information with others. It inform users about the functions, input parameter, output parameter and it 

also gives information about all kind of responses such as success, error, not found, internal server error etc., which makes a developer to write more robust code 

while consuming the API.

Before Spring Boot 2.4.x, implementation of swagger ui was quite easy, but from spring boot version 2.4.x onwards, this set up has changed, and it becomes more tedious.

If we go with current setup, we have to modify existing classes, put extra classes and then achieve what we suppose to get implement easily.

More change at the code level for this purpose has always discouraged in software development.

I am going to share a trick to achieve this with less changes, it will not break our existing setup and we don't have to modify/add classes.

Project Requirements

JDK 1.11 or higher Gradle 7.3.2 or higher spring boot 2.5 or higher


