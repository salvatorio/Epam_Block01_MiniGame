package com.fortuna;

import java.util.Scanner;

/**
 * Created on 24.04.2016.
 */
public class Controller {

    //Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner scan = new Scanner(System.in);
        int userNumber = -1;

        while(userNumber != model.getNumber()) {
            userNumber = inputIntValueWithScanner(scan);

            if(userNumber < model.getNumber()) {
                view.printMessage(view.LOWER_VALUE);
                model.setLowerBorder(userNumber+1);
            }
            else
            if(userNumber > model.getNumber()) {
                view.printMessage(view.BIGGER_VALUE);
                model.setUpperBorder(userNumber-1);
            }
        }

        view.printMessage(view.WIN_MESSAGE);
    }

    public int inputIntValueWithScanner(Scanner scan) {
        int number;
        view.printRequestMessage(model.getLowerBorder(), model.getUpperBorder());

        while( ! scan.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_NUMBER);
            view.printRequestMessage(model.getLowerBorder(), model.getUpperBorder());
            scan.next();
        }

        number = scan.nextInt();

        if((number < model.getLowerBorder() || (number > model.getUpperBorder()))) {
            view.printMessage(view.WRONG_INPUT_NUMBER);
            return inputIntValueWithScanner(scan);
        }
        return number;
    }
}
