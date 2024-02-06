package com.nctech.newbankpract;

public class PrintUtil {
    public static void printHeader() {
        System.out.println("""
                ===============================================
                               BANK APP
                ===============================================
                """);
    }
    public static void printMenu(){
        System.out.println("""
                1] A/C Creaton
                2] Deposit Money
                3] Withdraw Money
                4] Transfer Money
                5] Check Balance
                6] Exit
                """);

    }
}
