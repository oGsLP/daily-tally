package com.ogslp.tally.configurations;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @lenovo
 * @Author: XYF
 * @Date: 20/08/08
 * @Time: 22:20
 * @Package: com.ogslp.tally.configurations
 */

@Configuration
@EnableMongoRepositories(basePackages = "com.ogslp.tally.repositories")
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Value("${spring.data.mongodb.database}")
    private String databaseName;

    @Value("${spring.data.mongodb.uri}")
    private String databaseUri;

    protected String getDatabaseName() {
        return databaseName;
    }

    @Bean
    public MongoClient mongoClient() {

        return MongoClients.create(databaseUri);
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, databaseName);
    }
}
