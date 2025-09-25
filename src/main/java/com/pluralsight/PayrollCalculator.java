package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = input.nextLine();

        System.out.print("How many hours have you worked? ");
        double hoursWorked = input.nextFloat();

        System.out.print("What is your hourly pay rate? ");
        double payRate = input.nextFloat();

        double grossPay;
        if (hoursWorked > 40) {
            grossPay = (40 * payRate) + (hoursWorked - 40) * (payRate * 1.5f);
        } else {
            grossPay = hoursWorked * payRate;
        }
        System.out.println("Employee " + name + " has made a total of $" + grossPay);

        input.close();

    }
}
