package com.ogslp.tally.repositories;

import com.ogslp.tally.entities.TestEntity;
import com.ogslp.tally.entities.TestRef;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @lenovo
 * @Author: XYF
 * @Date: 20/08/08
 * @Time: 20:02
 * @Package: com.ogslp.tally.repositories
 */
@Repository
public interface TestEntityDao extends MongoRepository<TestEntity, String> {

    public TestEntity findByTestRef(TestRef ref);
}
