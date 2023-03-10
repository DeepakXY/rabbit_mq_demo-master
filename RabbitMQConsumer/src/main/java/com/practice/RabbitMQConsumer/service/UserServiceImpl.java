/*
 * Author Name: Rohit
 * Date: 09-12-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.practice.RabbitMQConsumer.service;

import com.practice.RabbitMQConsumer.domain.User;
import com.practice.RabbitMQConsumer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }

}
