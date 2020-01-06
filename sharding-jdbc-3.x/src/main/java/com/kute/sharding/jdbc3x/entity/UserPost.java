package com.kute.sharding.jdbc3x.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * created by bailong001 on 2020/01/05 09:35
 */
@Data
@Accessors(chain = true)
public class UserPost implements Serializable {

    private Long id;

    private String name;

}
