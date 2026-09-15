package Ecommerce;

public class UPI implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Payment Method: UPI");
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("UPI payment successful");
    }
}