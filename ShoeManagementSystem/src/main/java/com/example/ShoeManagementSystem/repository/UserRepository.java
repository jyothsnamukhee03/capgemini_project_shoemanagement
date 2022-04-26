package com.example.ShoeManagementSystem.repository;

import com.example.ShoeManagementSystem.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String userName);
}