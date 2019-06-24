# master-db-service
A scaffolding repo holding baseline code for all db related services

Creating DB User:
  `grant all privileges on *.* to 'school_admin'@'localhost' identified by 'admin_pwd';`
  
Building the executable Jar:
  https://spring.io/guides/gs/accessing-data-mysql/#_make_the_application_executable
  
  build using maven
  `mvn install`
  
  execute
  `java -jar target/master-db-service-0.1.0.jar`
  
  to use profile based startup
  `java -Dspring.profiles.active=prod -jar build/libs/clay-setup-0.1.0.jar`

  default profile is set to be "prod"
  
  Accessing Swagger API documentation
  
  Raw data rendering: http://localhost:8080/v2/api-docs
  UI rendering: http://localhost:8080/swagger-ui.html