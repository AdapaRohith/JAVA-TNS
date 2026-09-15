package Ecommerce;

import java.util.Scanner;

public class Ecommerce {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== E-Commerce Payment System =====");

        System.out.print("Enter product name: ");
        String product = sc.nextLine();

        System.out.print("Enter product price: ₹");
        double price = sc.nextDouble();

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. PayPal");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Payment payment;

        switch (choice) {

            case 1:
                payment = new CreditCard();
                break;

            case 2:
                payment = new UPI();
                break;

            case 3:
                payment = new PayPal();
                break;

            default:
                System.out.println("Invalid payment method");
                sc.close();
                return;
        }

        System.out.println("\n===== Order Details =====");
        System.out.println("Product: " + product);
        System.out.println("Price: ₹" + price);

        System.out.println("\n===== Payment =====");

        payment.pay(price);

        System.out.println("\nThank you for shopping!");

        sc.close();
    }
}