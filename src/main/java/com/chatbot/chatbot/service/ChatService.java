package com.chatbot.chatbot.service;

import com.chatbot.chatbot.model.ChatMessage;
import com.chatbot.chatbot.repo.ChatMessageRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatMessageRepo repo;

    public String getBotReply(String userMessage) {
        String reply = "Echo: " + userMessage;

        ChatMessage msg = new ChatMessage();
        msg.setUserMessage(userMessage);
        msg.setBotResponse(reply);
        repo.save(msg);

        return reply;
    }
}
