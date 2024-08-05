package com.codecraftwithkevin.spring.ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatController {
    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    @GetMapping("/ai")
    List<ActorFilms> generation(@RequestParam(value = "message", defaultValue = "Generate the filmography for 5 movies for  Michael Scofield") String message){
        return chatClient.prompt()
                .user(message)
                .call()
                .entity(new ParameterizedTypeReference<>() {
                });
    }
}
