# Phonebook
This is phonebook aplication with standard CRUD operations

## Install
First of all clone the project
```
git clone https://github.com/R3MH4X0R/Phonebook.git
```
Then to run it you will need to set your database url in application.properties file
```
spring.datasource.url=jdbc:
spring.datasource.username = root
spring.datasource.password = root
```
Then use maven to build project

```
mvn clean install
java -jar phonebook-1.0.jar

```
After that you can acces project through http://localhost:5000/
## Built With
* [Thymeleaf](https://www.thymeleaf.org/)
* [Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)

## License

This project is licensed under the MIT License - see the LICENSE.md file for details
