package org.zup.paulo.gerComics.services.interfaces;


import org.zup.paulo.gerComics.domain.Comic;

import java.util.List;

public interface ComicServiceAPI {

    public Comic get(Long id);

    public List<Comic> findAll();

    public Comic create(Comic comic);

    public void update(Comic comic);

    public void remove(Long id);
}
