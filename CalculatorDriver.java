/**
 * -----------------------------------------------
 * File name: CalculatorDriver.java
 * Assignment name: 1250 Review Lab
 * -----------------------------------------------
 * Author: Chris Boyle
 * Course: CSCI 1260-001
 * Creation date: 01/26/2022
 * -----------------------------------------------
 */

/**
 * Takes two double inputs and performs calculations
 * on them with Calculator.
 *
 * Creation date: 01/26/2022
 *
 * @author: Chris Boyle
 */

// Last semester you said we could do * for everything, and it didn't impact performance, so I did it.
import java.util.*;

public class CalculatorDriver
{

    /**
     * main method
     * @param args
     */

    public static void main(String[] args)
    {

        // Set the variables and start the scanner
        double numOne, numTwo;
        Scanner keyboard = new Scanner(System.in);

        // Get some inputs
        System.out.println("Let's play a game!");
        System.out.print("Please enter a number: ");
        numOne = keyboard.nextDouble();
        System.out.print("Please enter a second number: ");
        numTwo = keyboard.nextDouble();

        // Create the needed objects
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();
        Calculator calc4 = new Calculator();

        // Don't think it's strictly needed, but creating a "zeroing" clause seems appropriate
        calc1.clearResult();
        calc2.clearResult();
        calc3.clearResult();
        calc4.clearResult();

        // Calling the lab-required methods on each object
        calc1.addParams(numOne, numTwo);
        calc2.multiplyParams(numOne, numTwo);
        calc3.subtractParams(calc2.getResult(), calc1.getResult());
        calc4.squareParam(calc3.getResult());

        // Seemed out of place to just display calc4 with no buildup...then I got carried away. Sorry.
        System.out.println("I've added your numbers together.");
        System.out.println("I've multiplied your numbers.");
        System.out.println("I've subtracted the added total from the multiplied total.");
        System.out.println("And then I've squared that result. With all of that... ");
        System.out.println("Drum roll, please?");
        System.out.println();
        System.out.println("*drumroll noises*");
        System.out.println();
        System.out.println("Your final result is...");
        System.out.println();
        System.out.println("*more drumroll noises*");
        System.out.println();
        System.out.println(calc4.getResult() + "!");
        System.out.println("Pretty neat, right? Right?");
        System.out.println("Thanks for playing!");

        // Closing out the scanner
        keyboard.close();

    }
}
