# smartGoals

## about
a web site build using Spring Boot to control your goals.

## Technical Specifications
+ Java
+ Spring Boot
+ JPA
+ thymeleaf

## Directory Structure 

```
\
 |-src/main/java/br/com/possenti
 \
  |-controller
  \
   |-GoalController.java
  |-model
  \
   |-Goal.java
  |-repository
  \
   |-GoalRepository.java
  |-service
   \
    |-GoalService.java
  |-Application.java
 |-resources
 \
  |-static/bootstrap
  |-templates
  |-application.properties
 |-webapp/WEB-INF
 \
  |-web.xml
```
  
## Execution
```
mvn clean install
mvn package
java -jar target/smartGoals.jar
 ```

This command will execute a  smartGoals site in your browser at: http://localhost:9000


