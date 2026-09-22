package Practice;


interface PaymentProcessor {
    void pay(double amount);
}

class BankPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Bank Payment");
    }
}


//part2
class PayPal {

    public void makePayment(double value) {
        System.out.println("PayPal payment: $" + value);
    }
}
class PayPalAdapter implements PaymentProcessor {

    PayPal pay = new PayPal();
    @Override
    public void pay(double amount) {
        pay.makePayment(amount);
    }
}




//part3
class CryptoPayment {

    public void sendCrypto(double usdAmount) {
        System.out.println(
                "Crypto payment: $" + usdAmount
        );
    }
}
class CryptoPaymentAdapter implements PaymentProcessor {

    CryptoPayment pay = new CryptoPayment();
    @Override
    public void pay(double amount) {
        pay.sendCrypto(amount);
    }
}

public class Practice {

    public static void main(String[] args) {

        PaymentProcessor processor = new BankPayment();
        PaymentProcessor processor1 = new PayPalAdapter();
        PaymentProcessor processor2 = new CryptoPaymentAdapter();


        processor.pay(100.0);
        processor1.pay(100.0);
        processor2.pay(100.0);
    }
}

