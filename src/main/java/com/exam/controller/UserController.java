package com.exam.controller;


import com.common.Code;
import com.common.Result;
import com.exam.domain.User;
import com.exam.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jiangzg
 * @since 2023-05-27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;


    @GetMapping
    public Result getAll() {
        List<User> book = iUserService.listAll(1, 2);
        return new Result(Code.SAVE_OK, book, "成功");
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id) {
        User book = iUserService.getById(id);
        return new Result(Code.SAVE_OK, book, "成功");
    }
}

