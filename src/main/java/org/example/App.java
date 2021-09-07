package org.example;
import java.util.Scanner;  // Import the Scanner class


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Reese Spector
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
