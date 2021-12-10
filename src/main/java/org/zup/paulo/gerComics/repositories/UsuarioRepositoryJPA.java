package org.zup.paulo.gerComics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zup.paulo.gerComics.domain.User;

public interface UsuarioRepositoryJPA extends JpaRepository<User, Long> {
    
}
