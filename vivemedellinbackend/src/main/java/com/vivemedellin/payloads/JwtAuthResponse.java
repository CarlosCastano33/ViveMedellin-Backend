package com.vivemedellin.payloads;

import lombok.Data;

@Data
public class JwtAuthResponse {
    private final String message;
    private final String token;

    public JwtAuthResponse(String message, String token) {
        this.message = message;
        this.token = token;
    }
}
