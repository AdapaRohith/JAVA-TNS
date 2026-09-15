package Ecommerce;

public class CreditCard implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Payment Method: Credit Card");
        System.out.println("Amount Paid: ₹" + amount);
        System.out.println("Credit Card payment successful");
    }
}