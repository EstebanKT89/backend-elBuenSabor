package com.labIv.backend_elBuenSabor.exceptions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.InstantSerializer;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.time.LocalDateTime;
import java.util.List;


@SuppressWarnings("deprecation")
@JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
public class ApiError {

    private HttpStatus status;
    private int statusCode;

    @JsonSerialize(using = InstantSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private LocalDateTime timestamp;
    private MsgErrorEnum code;
    private String message;
    private String resource;
    private String stack;
    private List<ObjectError> errors;

    private ApiError() {
        timestamp = LocalDateTime.now();
    }

    public ApiError(HttpStatus status) {
        this();
        this.status = status;
        this.statusCode = status.value();
    }

    public ApiError(HttpStatus status, MsgErrorEnum code) {
        this();
        this.status = status;
        this.statusCode = status.value();
        this.code = code;
    }

    public ApiError(HttpStatus status, Throwable ex) {
        this();
        this.status = status;
        this.statusCode = status.value();
        this.message = "Unexpected error";
        this.stack = ex.getLocalizedMessage();
    }

    public ApiError(HttpStatus status, MsgErrorEnum code, Throwable ex) {
        this();
        this.status = status;
        this.statusCode = status.value();
        this.code = code;
        this.message = code.getMsg().trim();
        this.stack = ex.getLocalizedMessage();
    }

    public ApiError(HttpStatus status, MsgErrorEnum code, Throwable ex, String resource) {
        this();
        this.status = status;
        this.statusCode = status.value();
        this.code = code;
        this.message = code.getMsg().trim();
        this.stack = ex.getLocalizedMessage();
        this.resource = resource;
    }

    public ApiError(HttpStatus status, MsgErrorEnum code, Throwable ex, String resource, List<ObjectError> errors) {
        this();
        this.status = status;
        this.statusCode = status.value();
        this.code = code;
        this.message = code.getMsg().trim();
        this.stack = ex.getLocalizedMessage();
        this.resource = resource;
        this.errors = errors;
    }

    public HttpStatus getStatus(){
        return this.status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public MsgErrorEnum getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getStack() {
        return stack;
    }

    public String getResource() {
        return resource;
    }

    public List<ObjectError> getErrors() {
        return errors;
    }
}
