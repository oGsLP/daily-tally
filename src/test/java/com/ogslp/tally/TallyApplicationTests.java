package com.ogslp.tally;

import com.ogslp.tally.entities.TestEntity;
import com.ogslp.tally.entities.TestRef;
import com.ogslp.tally.entities.components.TestModel;
import com.ogslp.tally.services.TestService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TallyApplication.class)
class TallyApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    void contextLoads() {

    }

    @Test
    void test1(){



        testService.delete("5f2ed5e8d30bd504b0f5496f");
    }



}
