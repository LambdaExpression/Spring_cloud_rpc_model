package org.tcat.service.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


/**
 * Feign配置
 * <br/>注：EnableFeignClients 引用的只能引用实现类，如果引用了api接口，会导致
 * <br/>java.lang.IllegalStateException: Method has too many Body parameters
 *
 * @author Lin
 */
@Configuration
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "org.tcat.service.service")
public class FeignConfigurer {
}
