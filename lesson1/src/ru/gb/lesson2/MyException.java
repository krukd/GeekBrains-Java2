package ru.gb.lesson2;

public class MyException extends RuntimeException {

    private String message;

    public MyException(String message) {

        this.message = message;
    }

    @Override
    public String toString() {

        return "hereis.MyException: " + message;
    }
}
