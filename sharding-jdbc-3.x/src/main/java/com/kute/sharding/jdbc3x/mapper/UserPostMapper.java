package com.kute.sharding.jdbc3x.mapper;

import com.kute.sharding.jdbc3x.entity.UserPost;

/**
 * created by kute on 2020/01/05 09:35
 */
public interface UserPostMapper {

    UserPost findById(Long id);

    int add(UserPost userPost);

}
