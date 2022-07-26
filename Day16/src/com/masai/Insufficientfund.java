package com.masai;

public class Insufficientfund extends Exception{
    public Insufficientfund() {
    }

    public Insufficientfund(String message) {
        super(message);
    }
}
