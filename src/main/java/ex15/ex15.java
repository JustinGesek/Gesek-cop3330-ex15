package ex15;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;
import java.lang.Math;
//What is the password? 12345
//I don't know you.
//Or
//
//What is the password? abc$123
//Welcome!
public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the password? ");
        String password = scanner.nextLine();
        if(password.equals("abc$123"))
        {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}