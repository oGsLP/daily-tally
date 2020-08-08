package com.ogslp.tally.entities;

import com.ogslp.tally.entities.components.BaseEntity;
import com.ogslp.tally.entities.components.TestModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @lenovo
 * @Author: XYF
 * @Date: 20/08/08
 * @Time: 19:02
 * @Package: com.ogslp.tally.entities
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "test")
public class TestEntity extends BaseEntity {

    @Field("test_model")
    private TestModel testModel;

    @DBRef
    @Field("test_ref")
    private TestRef testRef;
}
