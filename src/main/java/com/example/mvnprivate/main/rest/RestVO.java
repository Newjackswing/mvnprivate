package com.example.mvnprivate.main.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class RestVO implements Serializable {
    private long timestamp;
    private Integer status;
    private String message;
    private String error;
    private String path;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Object value;

    public RestVO(long timestamp, Integer status, String message, String error, String path){
        this.timestamp = timestamp;
        this.status =  status;
        this.message = message;
        this.error = error;
        this.path = path;
    }

    public RestVO(long timestamp, Integer status, String message, String error, String path, Object value){
        this.timestamp = timestamp;
        this.status =  status;
        this.message = message;
        this.error = error;
        this.path = path;
        this.value = value;
    }
}
