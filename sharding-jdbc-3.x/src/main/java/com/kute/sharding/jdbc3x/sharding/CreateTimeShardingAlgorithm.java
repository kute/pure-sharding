package com.kute.sharding.jdbc3x.sharding;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.RangeShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import io.shardingsphere.api.algorithm.sharding.standard.RangeShardingAlgorithm;

import java.sql.Timestamp;
import java.util.Collection;

/**
 * created by bailong001 on 2020/01/05 17:06
 */
public class CreateTimeShardingAlgorithm implements PreciseShardingAlgorithm<Timestamp>, RangeShardingAlgorithm<Long> {

    /**
     * 用于=和IN
     *
     * @param availableTargetNames
     * @param shardingValue
     * @return
     */
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Timestamp> shardingValue) {
        return null;
    }

    /**
     * 用于between
     *
     * @param availableTargetNames
     * @param shardingValue
     * @return
     */
    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<Long> shardingValue) {
        return null;
    }
}
