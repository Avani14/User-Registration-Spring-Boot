package com.bridgelabz.registerationapp.dto;

import lombok.Data;

@Data
public class ResponseDTO {
    private Object object;
    private String message;

    public ResponseDTO( String message,Object object) {
        this.object = object;
        this.message = message;
    }
}
