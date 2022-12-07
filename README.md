# Movie Rating App : A Microservice Demo APplication

The application is a simple movie rating application. Its intended to demonstrate a simple microservice design with basic communication - using RestTemplate

It is built using [Spring Boot](http://projects.spring.io/spring-boot/), [Spring Cloud](https://spring.io/projects/spring-cloud) and [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).


##Basic Usage

A simple api GET request with  userId [1, 3, 3] will return a movie rated based on user id provided in url.

### Sample Request & Response

Request URL:  http://ocalhost:8080/movie-catalog/v1/1

JSON Response:

```
  {
    "movie-catalog":[
                      {
                          "movieId":"103",
                          "movieName":"Wednesday",
                          "category":"Horror",
                          "stars":"5"
                      }
                    ]
  }
```
