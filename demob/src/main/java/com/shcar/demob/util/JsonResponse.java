package com.shcar.demob.util;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Response web request with json format.
 * Use builder pattern or getter and setter to construct the object.
 * @param <E> the type of return data.
 */
@Getter
@Setter
public class JsonResponse<E> implements Serializable {

    private Integer statusCode;
    private String status;
    private String message;
    private E data;

    public JsonResponse() {}

    // builder pattern
    public JsonResponse<E> stateCode(StatusCode stateCode) {
        this.statusCode = stateCode.getCode();
        this.status = stateCode.getMessage();
        return this;
    }

    public JsonResponse<E> message(String message) {
        this.message = message;
        return this;
    }

    public JsonResponse<E> data(E data) {
        this.data = data;
        return this;
    }
}

