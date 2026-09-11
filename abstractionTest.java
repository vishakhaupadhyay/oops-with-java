
interface Payment {

    int a = 10;

    void makePayment();

    static void display() {
        System.out.println("Payment successful.");
    }
}

class UPI implements Payment {

    public void makePayment() {
        System.out.println("Payment made through UPI");
    }
}

class CreditCard implements Payment {

    public void makePayment() {
        System.out.println("Payment made through Credit Card");
    }
}

public class abstractionTest {

    public static void main(String[] args) {

        Payment payment1 = new UPI();
        payment1.makePayment();
        Payment.display();

        Payment payment2 = new CreditCard();
        payment2.makePayment();
        Payment.display();
    }
}

