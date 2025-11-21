package com.chatbot.chatbot.controller;

import com.chatbot.chatbot.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping("/chat")
    public String chat(@RequestBody String message) {
        return chatService.getBotReply(message);
    }
}
