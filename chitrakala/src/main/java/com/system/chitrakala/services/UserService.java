package com.system.chitrakala.services;

import com.system.chitrakala.entity.User;
import com.system.chitrakala.pojo.UserPojo;

public interface UserService {
    void saveUser(UserPojo userPojo);
    User findByEmail(String email);

    User findUserById(Integer user_id);
}
