package com.company.handlers;

public class DivisionByZero extends ArithmeticException{
    public DivisionByZero() {
    }

    public DivisionByZero(String s) {
        super(s);
    }
}
