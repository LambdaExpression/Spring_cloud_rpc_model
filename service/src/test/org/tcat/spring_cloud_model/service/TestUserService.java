package org.tcat.spring_cloud_model.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tcat.api.user.dto.UserDTO;
import org.tcat.api.user.service.UserServiceRemote;
import org.tcat.service.Application;

/**
 * @author Lin
 * @date 2018/3/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestUserService {

    @Autowired
    private UserServiceRemote userService;

    @Test
    public void test1() {
        UserDTO user = new UserDTO()
                .setId(1)
                .setName("name");
        System.out.println(userService.test(user));
    }

    @Test
    public void test2() {
        UserDTO user = new UserDTO()
                .setId(1)
                .setName("name");
        System.out.println(userService.test(2, user));
    }

}
