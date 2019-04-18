package com.sliwa.drewnobud.service;

public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username,String password);
}
