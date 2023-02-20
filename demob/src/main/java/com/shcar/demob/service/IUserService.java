package com.shcar.demob.service;


import com.shcar.demob.pojo.User;

import java.util.List;

/**
 * Service interface of User module
 */
public interface IUserService {
    /**
     * new user register.
     * @param user the data of user.
     */
    void register(User user);

    /**
     * user login by email and password.
     * @param email email of user account.
     * @param password original password.
     * @return a User POJO with all basic information, return null if the user is not exist.
     */
    User login(String email, String password);

    List<User> getAll();
}
