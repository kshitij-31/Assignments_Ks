package com.example.UserManager1.repositories;

import org.apache.catalina.User;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);
}
