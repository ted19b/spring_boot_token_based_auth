package de.hitech4every1.token_auth.endpoint;

import de.hitech4every1.token_auth.model.AppUser;
import de.hitech4every1.token_auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserEndpoint {

    @Autowired
    private UserService userService;

    @PostMapping("/registration")
    public void registration(@RequestBody AppUser newUser) {
        newUser.setPassword("");
        userService.addNewUserIntoDB(newUser);
    }

}
