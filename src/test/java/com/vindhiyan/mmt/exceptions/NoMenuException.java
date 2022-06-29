package com.vindhiyan.mmt.exceptions;

public class NoMenuException extends RuntimeException {

    public NoMenuException() {
        super("Cannot find menu item");
    }
}
