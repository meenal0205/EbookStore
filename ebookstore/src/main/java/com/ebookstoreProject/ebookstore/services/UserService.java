package com.ebookstoreProject.ebookstore.services;

import com.ebookstoreProject.ebookstore.entity.UserEntity;
import com.ebookstoreProject.ebookstore.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    User createUser(User user);
    List<User> getAllUser();
    User getUserById(Integer Id);
    User updateUser(Integer Id, User user);

}
