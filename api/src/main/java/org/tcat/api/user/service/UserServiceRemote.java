package org.tcat.api.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.tcat.api.user.dto.UserDTO;

/**
 * @author Lin
 * @date 2018/3/2.
 */
@FeignClient(name = "spring_cloud_model")
public interface UserServiceRemote {

    /**
     * 暂时找不到，每个接口类都要写path的方法。如果有好的方法或思路，欢迎在issues中提出来
     */
    String PATH = "user-service-remote/";

    @PostMapping(PATH + "test1")
    String test(UserDTO user);

    @PostMapping(PATH + "test2")
    String test(Integer id, UserDTO user);

}
