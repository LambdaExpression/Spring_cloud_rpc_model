package org.tcat.service.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.tcat.api.user.dto.UserDTO;
import org.tcat.api.user.service.UserServiceRemote;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lin
 * @date 2018/3/2.
 */
@RestController
public class UserService implements UserServiceRemote {

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public String test(UserDTO user) {
        return gson.toJson(user);
    }

    @Override
    public String test(Integer id, UserDTO user) {
        Map<String, Object> data = new HashMap<>();
        data.put("id", id);
        data.put("user", user);
        return gson.toJson(data);
    }

}
