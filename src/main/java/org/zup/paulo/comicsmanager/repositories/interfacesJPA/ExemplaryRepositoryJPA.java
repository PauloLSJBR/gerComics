package org.zup.paulo.comicsmanager.repositories.interfacesJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zup.paulo.comicsmanager.domain.Exemplary;
import org.zup.paulo.comicsmanager.domain.User;

import java.util.List;

@Repository
public interface ExemplaryRepositoryJPA extends JpaRepository<Exemplary, Long> {

    public List<Exemplary> findByUser(User user);

}
