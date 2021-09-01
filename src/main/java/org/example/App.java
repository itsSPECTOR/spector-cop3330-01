package org.example;
import java.util.Scanner;  // Import the Scanner class

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner name = new Scanner(System.in);
        System.out.print("What is your name? ");

        String userName = name.nextLine();
        System.out.print("Hello, ");
        System.out.print(userName);
        System.out.print(", nice to meet you!");

    }

}
