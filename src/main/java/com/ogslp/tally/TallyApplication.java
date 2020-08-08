package com.ogslp.tally;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoAuditing
@SpringBootApplication
public class TallyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TallyApplication.class, args);
    }

}
