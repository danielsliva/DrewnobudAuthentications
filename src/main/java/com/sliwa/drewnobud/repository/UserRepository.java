package com.sliwa.drewnobud.repository;


import com.sliwa.drewnobud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
