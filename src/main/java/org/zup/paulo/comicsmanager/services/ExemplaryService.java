package org.zup.paulo.comicsmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zup.paulo.comicsmanager.domain.Exemplary;
import org.zup.paulo.comicsmanager.exceptions.ExemplaryNotFoundException;
import org.zup.paulo.comicsmanager.repositories.interfacesJPA.ExemplaryRepositoryJPA;
import org.zup.paulo.comicsmanager.services.interfaces.ExemplaryServiceAPI;

import java.util.List;

@Service
public class ExemplaryService implements ExemplaryServiceAPI {

    @Autowired
    private ExemplaryRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    public Exemplary get(Long id){

        try {
            Exemplary exemplary = repositoryJPA.findById(id).get();
            return exemplary;
        } catch (Exception ex) {
            throw new ExemplaryNotFoundException(String.format("Exemplar não existe com esse id: %s ", id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Exemplary> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Exemplary create(Exemplary exemplary) {

        return repositoryJPA.save(exemplary);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Exemplary exemplary) {
        repositoryJPA.save(exemplary);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

 }
