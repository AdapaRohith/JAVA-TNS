package Ecommerce;

public class PayPal implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Payment Method: PayPal");
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("PayPal payment successful");
    }
}