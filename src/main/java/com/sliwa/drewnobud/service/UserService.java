package com.sliwa.drewnobud.service;

import com.sliwa.drewnobud.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
