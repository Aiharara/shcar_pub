package com.shcar.demob.controller;


import com.shcar.demob.pojo.User;
import com.shcar.demob.service.IUserService;
import com.shcar.demob.util.JsonResponse;
import com.shcar.demob.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;


@CrossOrigin()
@RestController
@RequestMapping("api/users")
public class UserController extends BaseController implements Serializable {

    @Autowired
    private IUserService userService;

    @PostMapping(value = "register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public JsonResponse<Void> registerJson(@RequestBody User user) {
        return register(user);
    }

    @PostMapping(value = "register", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public JsonResponse<Void> registerFormData(User user) {
        return register(user);
    }

    private JsonResponse<Void> register(User user) {
        JsonResponse<Void> response = new JsonResponse<>();
        userService.register(user);
        response.stateCode(StatusCode.Created)
                .message("User registration success.");
        logger.trace("User registration success.");

        return response;
    }

    @PostMapping(value = "login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public JsonResponse<User> loginJson(@RequestBody User user) {
        return login(user);
    }

    @PostMapping(value = "login", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public JsonResponse<User> loginFormData(User user) {
        return login(user);
    }

    private JsonResponse<User> login(User user) {
        User retUser = userService.login(user.getEmail(), user.getPassword());
        if (retUser == null) return new JsonResponse<User>()
                .stateCode(StatusCode.Unauthorized)
                        .message("login fail");
        logger.trace("User login success.");
        return new JsonResponse<User>()
                .stateCode(StatusCode.OK)
                .message("User login success.")
                .data(retUser);
    }

    @GetMapping(value = "all")
    public JsonResponse<List<User>> getAllUser() {
        return new JsonResponse<List<User>>()
                .stateCode(StatusCode.OK)
                .message("Get all users information")
                .data(userService.getAll());
    }
}

