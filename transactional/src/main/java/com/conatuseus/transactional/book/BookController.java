package com.conatuseus.transactional.book;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @PostMapping
    public ResponseEntity save() {
        return (ResponseEntity) ResponseEntity.ok();
    }
}
