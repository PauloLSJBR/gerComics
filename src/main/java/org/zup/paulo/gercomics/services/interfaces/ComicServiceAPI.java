package org.zup.paulo.gercomics.services.interfaces;


import org.zup.paulo.gercomics.domain.Comic;

import java.util.List;

public interface ComicServiceAPI {

    public Comic get(Long id);

    public List<Comic> findAll();

    public Comic create(Comic comic);

    public void update(Comic comic);

    public void remove(Long id);
}
