package com.ogslp.tally.entities.components;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @lenovo
 * @Author: XYF
 * @Date: 20/08/08
 * @Time: 19:32
 * @Package: com.ogslp.tally.entities.components
 */
@Data
public class BaseEntity {

    @Id
    private String id;

    @Field("created_at")
    @CreatedDate
    private Date createdAt;

    @Field("updated_at")
    private Date updatedAt;

}
