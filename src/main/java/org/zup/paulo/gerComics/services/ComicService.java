package org.zup.paulo.gerComics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zup.paulo.gerComics.domain.Comic;
import org.zup.paulo.gerComics.exceptions.ComicNotFoundException;
import org.zup.paulo.gerComics.repositories.interfacesJPA.ComicRepositoryJPA;
import org.zup.paulo.gerComics.services.interfaces.ComicServiceAPI;

import java.util.List;

@Service
public class ComicService implements ComicServiceAPI {

    @Autowired
    private ComicRepositoryJPA repositoryJPA;

    @Transactional(readOnly = true)
    public Comic get(Long id){

        try {
            Comic comic = repositoryJPA.findById(id).get();
            return comic;
        } catch (Exception ex) {
            throw new ComicNotFoundException(String.format("Quadrinho não existe com esse id: %s ", id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Comic> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Comic create(Comic comic) {

        return repositoryJPA.save(comic);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Comic comic) {
        repositoryJPA.save(comic);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

}


