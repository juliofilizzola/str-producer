package com.juliofilizzola.strproducer.resources;

import com.juliofilizzola.strproducer.services.StringProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/sendMessage")
public class StringProducerResource {

    private final StringProducerService stringProducerService;
    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message) {
        stringProducerService.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
