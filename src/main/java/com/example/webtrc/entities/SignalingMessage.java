package com.example.webtrc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignalingMessage {
    private String from;
    private String to;
    private String type; // "offer", "answer", "candidate"
    private String sdp; // for offer/answer
    private String candidate; // for ICE
}