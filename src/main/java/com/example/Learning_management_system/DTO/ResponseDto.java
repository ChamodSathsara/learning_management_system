package com.example.Learning_management_system.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {
    private T data;
    private String message;
    private boolean success;
    private int statusCode;

    public ResponseDto(T data, boolean success) {
        this.data = data;
        this.success = success;
    }
}


