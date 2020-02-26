package de.hitech4every1.token_auth.service;

import de.hitech4every1.token_auth.model.AppUser;
import de.hitech4every1.token_auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public void addNewUserIntoDB(AppUser newUser) {
        userRepository.save(newUser);
    }

}
