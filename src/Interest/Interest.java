package Interest;

// Java program to compute
// simple interest for given principal
// amount, time and rate of interest.
import java.io.*;
 
class Interest {
    public static void main(String args[])
    {
        // We can change values here for
        // different inputs
        float P = 10, R = 10, T = 10;
 
        /* Calculate simple interest */
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
}