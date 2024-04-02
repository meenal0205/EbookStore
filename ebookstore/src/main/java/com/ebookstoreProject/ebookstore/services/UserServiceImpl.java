package com.ebookstoreProject.ebookstore.services;

import com.ebookstoreProject.ebookstore.Repository.UserRepository;
import com.ebookstoreProject.ebookstore.entity.UserEntity;
import com.ebookstoreProject.ebookstore.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User createUser(User user) {
        UserEntity userEntity=new UserEntity();
        BeanUtils.copyProperties(user,userEntity);
        userRepository.save(userEntity);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<UserEntity> userEntities= userRepository.findAll();
        List<User> users=userEntities
                .stream()
                .map(user->new User(
                        user.getId(),
                        user.getUsername(),
                        user.getPassword(),
                        user.getBasket()))
                .collect(Collectors.toList());

        return users;
    }

    @Override
    public User getUserById(Integer Id ) {
        UserEntity userEntity = userRepository.findById(Id).get();
        User user=new User();
        BeanUtils.copyProperties(userEntity,user);
        return user;
    }

    @Override
    public User updateUser(Integer Id, User user) {
        UserEntity userEntity=userRepository.findById(Id).get();
        
        userEntity.setBasket(user.getBasket());
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userRepository.save(userEntity);
        return user;

    }
}
