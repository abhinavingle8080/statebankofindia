package com.nctech.newbankpract;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {
    static Scanner scanner = new Scanner(System.in);

    public static int inputMenu(){
        int option = 0;
        boolean isError = false;
        do {
            System.out.println(CommonConstants.LINE_SEP);
            System.out.print("Please Enter a Service : ");
            try {
                option = scanner.nextInt();
                isError = false;
            } catch (InputMismatchException e) {
                System.out.println("Error ->  Please Enter a valid number");
                isError = true;
                scanner.nextLine(); // for buffer removal
            }
            System.out.println(CommonConstants.LINE_SEP);
        } while(isError);

        return option;
    }

    public static String inputName(){
        String name = "";
        boolean isError = false;
        do {
            System.out.print("Enter a Name :  ");
            try {
                name = scanner.next();
                isError = false;
            } catch (InputMismatchException e) {
                System.out.println("Error ->  Please Enter a valid Name");
                isError = true;
            }
        } while (isError);
        return name;
    }

    public static long inputAccountNumber() {
        long accountNumber = 0;
        System.out.print("Enter a Account Number : ");
        try {
            accountNumber = scanner.nextLong();
        } catch (InputMismatchException e) {
            System.out.println("Error ->  Please Enter a valid Account Number");
            scanner.nextLine();
        }
        return accountNumber;
    }

    public static double inputAmount() {
        double amount = 0;
        System.out.print("Enter a Amount : ");
        try {
            amount = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error ->  Please Enter a valid Amount");
        }
        return amount;
    }
}
