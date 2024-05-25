package com.labIv.backend_elBuenSabor.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

import java.util.List;

public class ServiceException extends Exception{

    private static final long serialVersionUID = -4486285316041419025L;

    private final Level level;

    private HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
    private MsgErrorEnum code;
    private String resource = "";
    private List<ObjectError> errors;

    /**
     * Constructs an exception with a message and a default Level.ERROR.
     *
     * @param message
     */
    public ServiceException(String message) {
        this(Level.ERROR, message, null);
    }

    /**
     * Constructs an exception with a message and a default Level.ERROR.
     *
     * @param message
     */
    public ServiceException(String message, String resource) {
        this(Level.ERROR, message, resource, null);
    }

    /**
     * Constructs an exception with a message and a level as passed as parameters.
     *
     * @param level
     * @param message
     */
    public ServiceException(Level level, String message) {
        this(level, message, null);
    }

    /**
     * Constructs an exception with a message, cause and a default Level.ERROR.
     *
     * @param message
     * @param cause
     */
    public ServiceException(String message, Throwable cause) {
        this(Level.ERROR, message, cause);
    }

    /**
     * Constructs an exception with a level, message and cause.
     *
     * @param level
     * @param message
     * @param cause
     */
    public ServiceException(Level level, String message, Throwable cause) {
        super(message, cause);
        this.level = level;
    }

    /**
     * Constructs an exception with a level, message, resource and cause.
     *
     * @param level
     * @param message
     * @param resource
     * @param cause
     */
    public ServiceException(Level level, String message, String resource, Throwable cause) {
        super(message, cause);
        this.level = level;
        this.resource = resource;
    }

    /**
     * Constructs an exception with a level, message, cause, status and code.
     *
     * @param level
     * @param message
     * @param cause
     * @param status
     * @param code
     */
    public ServiceException(Level level, String message, Throwable cause, HttpStatus status, MsgErrorEnum code) {
        super(message, cause);
        this.level = level;
        this.status = status;
        this.code = code;
    }

    /**
     * Constructs an exception with a message, resource, status, code and a default Level.ERROR.
     *
     * @param message
     * @param resource
     * @param status
     * @param code
     */
    public ServiceException(String message, String resource, HttpStatus status, MsgErrorEnum code) {
        super(message, null);
        this.level = Level.ERROR;
        this.status = status;
        this.resource = resource;
        this.code = code;
    }

    /**
     * Constructs an exception with a message, code, default status HttpStatus.INTERNAL_SERVER_ERROR and a default Level.ERROR.
     *
     * @param message
     * @param code
     */
    public ServiceException(String message, MsgErrorEnum code) {
        super(message, null);
        this.level = Level.ERROR;
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
        this.code = code;
    }

    /**
     * Constructs an exception with a resource, status, code and a default Level.ERROR.
     *
     * @param resource
     * @param status
     * @param code
     */
    public ServiceException(String resource, HttpStatus status, MsgErrorEnum code) {
        super(code.getMsg(), null);
        this.level = Level.ERROR;
        this.status = status;
        this.resource = resource;
        this.code = code;
    }

    /**
     * Constructs an exception with a resource, status, code, error's list and a default Level.ERROR.
     *
     * @param resource
     * @param status
     * @param code
     */
    public ServiceException(String resource, HttpStatus status, MsgErrorEnum code, List<ObjectError> errors) {
        super(code.getMsg(), null);
        this.level = Level.ERROR;
        this.status = status;
        this.resource = resource;
        this.code = code;
        this.errors = errors;
    }


    /**
     * Constructs an exception with a level and code.
     *
     * @param level
     * @param code
     */
    public ServiceException(Level level, MsgErrorEnum code) {
        super(code.getMsg(), null);
        this.level = level;
        this.code = code;
    }

    /**
     * Constructs an exception with a level, status and code.
     *
     * @param level
     * @param status
     * @param code
     */
    public ServiceException(Level level, HttpStatus status, MsgErrorEnum code) {
        super(code.getMsg(), null);
        this.level = level;
        this.status = status;
        this.code = code;
    }

    /**
     * Constructs an exception with a message, status, a default level.Error and a default code HANDLE_SERVER_EXCEPTION.
     *
     * @param message
     * @param status
     */
    public ServiceException(String message, HttpStatus status) {

        this(Level.ERROR, message, null, status, MsgErrorEnum.HANDLE_SERVER_EXCEPTION);
    }

    public Level getLevel() {
        return level;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public MsgErrorEnum getCode() {
        return code;
    }

    public void setCode(MsgErrorEnum code) {
        this.code = code;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public List<ObjectError> getErrors() {
        return errors;
    }

    public void setErrors(List<ObjectError> errors) {
        this.errors = errors;
    }
}
