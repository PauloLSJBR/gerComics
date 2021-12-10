package org.zup.paulo.gercomics.repositories.interfacesJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zup.paulo.gercomics.domain.Exemplary;

@Repository
public interface ExemplaryRepositoryJPA extends JpaRepository<Exemplary, Long> {

}
