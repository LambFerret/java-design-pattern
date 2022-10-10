package com.lambferret.design_pattern.setting;

import org.springframework.http.HttpEntity;

public class ResponseEntity extends HttpEntity {

    private final Object status;
    private final Object code;
    private final Object message;

    public ResponseEntity(Object status, Object code, Object message){
        this.status = status;
        this.code = code;
        this.message = message;
    }

}
