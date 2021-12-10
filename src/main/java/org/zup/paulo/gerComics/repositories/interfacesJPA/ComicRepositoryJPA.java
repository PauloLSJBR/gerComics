package org.zup.paulo.gerComics.repositories.interfacesJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zup.paulo.gerComics.domain.Comic;

@Repository
public interface ComicRepositoryJPA extends JpaRepository<Comic, Long> {

}