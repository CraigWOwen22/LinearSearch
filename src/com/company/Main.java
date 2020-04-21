package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the linear search program \nPlease enter the length of the array.");
        int length = scan.nextInt();
        int[] array = new int[length];

        System.out.println("Please populate the array. Press return after each value.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.print("Here is your array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        boolean retry = true;
        while(retry) {
            System.out.println("\nWhat number would you like to search for?");
            int target = scan.nextInt();
            int index = LinearSearch.linearSearch(array, target);
            scan.nextLine();//Consume newline character

            if (index == -1) {
                System.out.printf("The value %d was not found", target);
                System.out.println("\nWould you like to try again? (Y/N)");
                String answer = scan.nextLine();
                if(answer.contains("N")){
                    retry = false;
                }
            } else {
                System.out.printf("The value %d was found at position %d", target, index);
                System.out.println("\nWould you like to try again? (Y/N)");
                String answer = scan.nextLine();
                if(answer.contains("N")){
                    retry = false;
                }

            }
        }

        scan.close();

    }
}
