package com.kute.sharding.jdbc4x.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * created by bailong001 on 2020/01/05 09:34
 */
@Configuration
@MapperScan({"com.kute.sharding.jdbc4x.mapper"})
public class MybatisConfig {
}
