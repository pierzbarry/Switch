package com.company;

public class Main {

    public static void main(String[] args) {
        //This program will print the months that  when you run it.
        int month = 341434234;
        String monthName;
        switch (month) {
            case 28:  monthName = "February is the only month with 28 days!";
                break;
            case 29:  monthName = "February (leap year).";
                break;
            case 30:  monthName = "April, June, September, and November.";
                break;
            case 31:  monthName = "January, March, May, July, August, October, and December.";
                break;

            default: monthName = "There aren't any months that have " + month + " days.";
                break;
        }
        System.out.println(monthName);
    }
}
