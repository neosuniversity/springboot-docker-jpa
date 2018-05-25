package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class Application {
	
	//RUn the applcation only with boot
	//mvn package && java -jar target/gs-spring-boot-docker-0.1.0.jar
	
	//build container
	//mvn install dockerfile:build
     //run container
	//docker run -p 8080:8080 -t springio/gs-spring-boot-docker

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}