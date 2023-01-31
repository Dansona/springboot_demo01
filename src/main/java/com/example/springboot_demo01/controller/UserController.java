/**
 * Copyright (C), 2022-2023,
 * FileName: UserController
 * Author:   cyl
 * Date:     2023/1/31 23:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.springboot_demo01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cyl
 * @create 2023/1/31
 * @since 1.0.0
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUserById(){
        System.out.println("springboot is running");
        return "springboot is running";
    }
}