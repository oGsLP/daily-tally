package com.ogslp.tally.services;

import com.ogslp.tally.entities.TestEntity;
import com.ogslp.tally.entities.TestRef;
import org.springframework.stereotype.Service;

/**
 * @lenovo
 * @Author: XYF
 * @Date: 20/08/08
 * @Time: 20:06
 * @Package: com.ogslp.tally.services
 */
public interface TestService {
    public void insert();

    public void delete(String id);
}
