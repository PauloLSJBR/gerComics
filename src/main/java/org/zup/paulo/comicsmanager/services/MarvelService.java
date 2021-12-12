package org.zup.paulo.comicsmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zup.paulo.comicsmanager.domain.Comic;
import org.zup.paulo.comicsmanager.representations.response.ComicsResponse;
import org.zup.paulo.comicsmanager.restclient.MarvelComicsClient;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Date;

@Service
public class MarvelService {
    private static final String PUBLIC_KEY = "720bdf9852d83661fe5e5d57d9aba9ed";
    private static final String PRIVATE_KEY = "144fcb44515c6b5dc3ba4bc959612a90c4895215";

    @Autowired
    private MarvelComicsClient client;

    public Comic findComic(Long comicId) {
        Long timeStamp = new Date().getTime();

        ComicsResponse response = client.getComic(comicId, timeStamp, PUBLIC_KEY, buildHash(timeStamp));

        Comic comic = new Comic();

        return comic;
    }

    private String buildHash(Long timeStamp) {
        return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PUBLIC_KEY);
    }


}
