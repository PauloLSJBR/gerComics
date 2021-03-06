package org.zup.paulo.comicsmanager.repositories.interfacesJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zup.paulo.comicsmanager.domain.User;

@Repository
public interface UserRepositoryJPA extends JpaRepository<User, Long> {
    
}
