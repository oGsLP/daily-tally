package com.ogslp.tally.services.impl;

import com.ogslp.tally.entities.TestEntity;
import com.ogslp.tally.entities.TestRef;
import com.ogslp.tally.entities.components.TestModel;
import com.ogslp.tally.repositories.TestEntityDao;
import com.ogslp.tally.repositories.TestRefDao;
import com.ogslp.tally.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @lenovo
 * @Author: XYF
 * @Date: 20/08/08
 * @Time: 20:18
 * @Package: com.ogslp.tally.services.impl
 */
@Service
public class TestServiceImpl implements TestService  {

    @Autowired
    private TestEntityDao testEntityDao;

    @Autowired
    private TestRefDao testRefDao;

    @Override
    public void insert() {
        TestEntity testEntity=new TestEntity();

        TestRef testRef = new TestRef();
        testRef.setRefName("refff");
        testRef.setRefValue("vvvvv");
        testRef.setUpdatedAt(new Date());
        testRefDao.save(testRef);

        testEntity.setTestRef(testRef);
        TestModel testModel=new TestModel();
        testModel.setName("mmm");
        testModel.setValue("ddd");
        testEntity.setTestModel(testModel);
        testEntity.setUpdatedAt(new Date());

        TestRef ref = new TestRef();
        ref.setRefValue("dsda");
        ref.setRefName("ddddassda");
        ref.setUpdatedAt(new Date());

        testRefDao.save(ref);
        testEntityDao.save(testEntity);
    }

    @Override
    public void delete(String id) {
        testEntityDao.deleteById(id);
    }

}
