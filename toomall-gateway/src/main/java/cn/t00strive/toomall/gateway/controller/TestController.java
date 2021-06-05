package cn.t00strive.toomall.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author duansg
 * @version 1.0
 * @date 2021/6/5 下午4:51
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/getConfig")
    public String getConfig(){
        return name;
    }

}
