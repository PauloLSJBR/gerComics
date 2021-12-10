package org.zup.paulo.gerComics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zup.paulo.gerComics.domain.Comic;

public interface ComicRepositoryJPA extends JpaRepository<Comic, Long> {

}