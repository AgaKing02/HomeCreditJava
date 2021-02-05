package com.company.handlers;

import java.util.InputMismatchException;

public class OperationNotFoundException extends InputMismatchException {
    public OperationNotFoundException() {
    }

    public OperationNotFoundException(String s) {
        super(s);
    }
}
