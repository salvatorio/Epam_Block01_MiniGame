package com.fortuna;

/**
 * Created on 24.04.2016.
 */
public class View {
    // Text's constants
    public static final String WRONG_INPUT_NUMBER = "Wrong input!";
    private static final String MESSAGE_FOR_REQUEST = "Please input a positive number between ";
    public static final String BIGGER_VALUE = "Your input number is bigger than selected! ";
    public static final String LOWER_VALUE = "Your input number is lower than selected! ";
    public static final String WIN_MESSAGE = "WIN! This number was selected! ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printRequestMessage(int lowerBorder, int upperBorder){
        System.out.println(MESSAGE_FOR_REQUEST + lowerBorder + " and " + upperBorder);
    }
}
