package org.zup.paulo.gercomics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zup.paulo.gercomics.domain.User;
import org.zup.paulo.gercomics.exceptions.UserNotFoundException;
import org.zup.paulo.gercomics.repositories.interfacesJPA.UserRepositoryJPA;
import org.zup.paulo.gercomics.services.interfaces.UserServiceAPI;

import java.util.List;

@Service
public class UserService implements UserServiceAPI {

    @Autowired
    private UserRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    public User get(Long id){

        try {
            User user = repositoryJPA.findById(id).get();
            return user;
        } catch (Exception ex) {
            throw new UserNotFoundException(String.format("Banda não existe com esse id: %s ", id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public User create(User user) {

        return repositoryJPA.save(user);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(User user) {
        repositoryJPA.save(user);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

}

