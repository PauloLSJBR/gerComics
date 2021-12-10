package org.zup.paulo.gercomics.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zup.paulo.gercomics.domain.User;
import org.zup.paulo.gercomics.repositories.interfacesJPA.UserRepositoryJPA;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    @Autowired
    private UserRepositoryJPA repositoryJPA;

    @Autowired
    private DataSource dataSource;

    public List<User> findAll() {
        return repositoryJPA.findAll();
    }

    public Optional<User> findById(Long id) {
        return repositoryJPA.findById(id);
    }

    public User save(User user) {
        return repositoryJPA.save(user);
    }

    public void deleteById(Long id) {
        repositoryJPA.deleteById(id);
    }

}
