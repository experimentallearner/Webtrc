package com.example.webtrc.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.webtrc.entities.SignalingMessage;

@Controller
@CrossOrigin("*")
public class SignalingController {

  @MessageMapping("/signal")
  @SendTo("/topic/signals")
  public SignalingMessage signaling(SignalingMessage message) {
    return message;
  }
}










