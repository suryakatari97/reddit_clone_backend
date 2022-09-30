package com.example.springredditclone.exceptions;


public class SpringRedditException extends RuntimeException {
   //calling super method
    public SpringRedditException(String exMessage) {
        super(exMessage);
    }
    public SpringRedditException(String exMessage, Exception exception) {
        super(exMessage);
    }
}
