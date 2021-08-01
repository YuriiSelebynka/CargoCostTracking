package edu.yurii;

import edu.yurii.model.Chauffeur;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CargoCostTrackingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CargoCostTrackingApplication.class, args);
    }


    //Chauffeur NULL = new Chauffeur(null, "null", "null", "null", 0);


}
