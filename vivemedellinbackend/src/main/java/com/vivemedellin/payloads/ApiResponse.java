package com.vivemedellin.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    private final String message;
    private final boolean success;
    private String token;

    public ApiResponse(String message, boolean status) {
        this.message = message;
        this.success = status;
    }

}
