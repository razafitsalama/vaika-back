package com.Vaika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Vaika.modele.Message;
import com.Vaika.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/messages")
@CrossOrigin(origins = "http://localhost:3000")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public ResponseEntity<List<Message>> getAllMessages() {
        List<Message> messages = messageService.getAllMessages();
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        Message createdMessage = messageService.createMessage(message);
        return new ResponseEntity<>(createdMessage, HttpStatus.CREATED);
    }
}

