/**
 * -----------------------------------------------
 * File name: Calculator.java
 * Assignment name: 1250 Review Lab
 * -----------------------------------------------
 * Author: Chris Boyle
 * Course: CSCI 1260-001
 * Creation date: 01/26/2022
 * -----------------------------------------------
 */

/**
 * Describes calculator functions
 *
 * Creation date: 01/26/2022
 *
 * @author: Chris Boyle
 */

public class Calculator
{
    // Just need one field
    private double result;

    /**
     * Accessor to get the specified value
     * @return - returns the current double value of "result"
     */
    public double getResult()
    {
        return result;
    }

    /**
     * Adds the given parameters passed to it
     * @param paramOne - double input
     * @param paramTwo - double input
     */
    public void addParams(double paramOne, double paramTwo)
    {
        result = paramOne+paramTwo;
    }

    /**
     * Subtracts the given parameters passed to it
     * @param paramOne - double input
     * @param paramTwo - double input
     */
    public void subtractParams(double paramOne, double paramTwo)
    {
        result = paramTwo-paramOne;
    }

    /**
     * Multiplies the given parameters passed to it
     * @param paramOne - double input
     * @param paramTwo - double input
     */
    public void multiplyParams(double paramOne, double paramTwo)
    {
        result = paramTwo*paramOne;
    }

    /**
     * Squares the given parameter passed to it
     * @param paramOne - input double
     */
    public void squareParam(double paramOne)
    {
        result = Math.pow(paramOne, 2);
    }

    /**
     * Resets the value of "result" to zero
     */
    public void clearResult()
    {
        result = 0;
    }

}
