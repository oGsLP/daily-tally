package com.ogslp.tally.entities;

import com.ogslp.tally.entities.components.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @lenovo
 * @Author: XYF
 * @Date: 20/08/08
 * @Time: 19:54
 * @Package: com.ogslp.tally.entities
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "ref")
public class TestRef extends BaseEntity {

    @Field("ref_name")
    private String refName;

    @Field("ref_value")
    private String refValue;

}
