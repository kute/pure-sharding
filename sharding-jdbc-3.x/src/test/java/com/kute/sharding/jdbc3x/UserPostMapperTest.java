package com.kute.sharding.jdbc3x;

import com.kute.sharding.jdbc3x.entity.UserPost;
import com.kute.sharding.jdbc3x.mapper.UserPostMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = {ShardingJdbc3xApplication.class})
@ComponentScan(value = {"com.lianjia", "com.alibaba.dubbo"})
public class UserPostMapperTest {

    @Autowired
    private UserPostMapper userPostMapper;

    @Test
    public void testUserPost() {

        UserPost userPost = userPostMapper.findById(5L);
        System.out.println(userPost);

    }

    @Test
    public void testInsert() {
//        for (Long i = 0L; i < 1L; i++) {
//            Long id = ThreadLocalRandom.current().nextLong(10000L);
            UserPost userPost = new UserPost()
                    .setName("-name-");
            userPostMapper.add(userPost);
            System.out.println(userPost);
//        }
    }

}
