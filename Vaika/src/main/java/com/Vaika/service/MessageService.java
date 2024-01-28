package com.Vaika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaika.modele.Message;
import com.Vaika.repository.MessageRepository;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public Message createMessage(Message message) {
        // Logique de création du message
        return messageRepository.save(message);
    }

    // Autres méthodes pour marquer comme lu, supprimer, etc.
}

