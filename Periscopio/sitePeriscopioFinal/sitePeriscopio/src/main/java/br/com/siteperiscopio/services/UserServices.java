package br.com.siteperiscopio.services;


import br.com.siteperiscopio.models.User;
import br.com.siteperiscopio.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private RepositoryUser repositoryUser;

    public void userSignUp(User user){
        repositoryUser.save(user);
    }

    public User userSignIn(User user) {
        List<User> users = repositoryUser.findAll();

        if (users.contains(user)) {
            return user;
        }
        return null;
    }


}
