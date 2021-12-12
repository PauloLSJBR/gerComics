package org.zup.paulo.comicsmanager.repositories.interfacesJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zup.paulo.comicsmanager.domain.Comic;

@Repository
public interface ComicRepositoryJPA extends JpaRepository<Comic, Long> {

}