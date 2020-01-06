package com.kute.sharding.jdbc4x.sharding;


import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

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
     * @param collection
     * @param rangeShardingValue
     * @return
     */
    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Long> rangeShardingValue) {
        return null;
    }
}
