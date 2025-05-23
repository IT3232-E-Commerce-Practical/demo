package com.example.demo.model

public class ErrorResponce {

    private int statusCode;
    private String errorMessage;
    public ErrorResponce(){

    }
    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

   
}
