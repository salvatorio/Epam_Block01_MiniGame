package com.fortuna;

/**
 * Created on 24.04.2016.
 */
public class Main {

    public static void main(String[] args) {

        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        //Run
        controller.processUser();
    }
}
