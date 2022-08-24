package com.total.august.cit.controllers.exceptions;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class StandartError implements Serializable {


    private static final long serialVersionUID = 9038670309569693315L;

    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandartError() {
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
