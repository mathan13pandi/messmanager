package com.app.messmanager.response;

public class Response {
    protected  String statusMessage;
    protected  int statusCode;

    public  Response() {

    }

    public Response(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }


}
