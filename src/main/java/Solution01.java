/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thomas Wallsmith
 */

/*
    Pseudocode:
        Create newScanner scanner object
        Print "What is your name? " to the console
        Read input into userName using newScanner
        Print "Hello, [userName], it's nice to meet you!"
 */

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = newScanner.nextLine();
        System.out.print("Hello, "+userName+", it's nice to meet you!");

    }
}
