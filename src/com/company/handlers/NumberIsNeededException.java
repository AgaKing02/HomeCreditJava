package com.company.handlers;

import java.util.InputMismatchException;

public class NumberIsNeededException extends NumberFormatException {
    public NumberIsNeededException() {
    }

    public NumberIsNeededException(String s) {
        super(s);
    }
}
