package org.zup.paulo.gercomics.repositories.interfacesJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zup.paulo.gercomics.domain.Comic;

@Repository
public interface ComicRepositoryJPA extends JpaRepository<Comic, Long> {

}