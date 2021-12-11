package org.zup.paulo.gercomics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zup.paulo.gercomics.domain.Comic;
import org.zup.paulo.gercomics.services.ComicService;

import java.util.List;

@RestController
@RequestMapping("/comics")
@CrossOrigin
public class ComicController {

    @Autowired
    private ComicService service;

    @GetMapping()
    public @ResponseBody
    HttpEntity<Object> find(@RequestParam(name = "user", required = false) Long userId) {

        if(userId == null) {

            List<Comic> comics = service.findAll();
            return ResponseEntity.ok(comics);
        }

        List<Comic> comics = service.getByUser(userId);
        return ResponseEntity.ok(comics);
    }

}
