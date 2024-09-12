// Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete Strategy: CreditCardPayment
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Credit Card: " + cardNumber);
    }
}

// Concrete Strategy: PayPalPayment
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal: " + email);
    }
}

// Concrete Strategy: BankTransferPayment
class BankTransferPayment implements PaymentStrategy {
    private String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Bank Transfer: " + bankAccount);
    }
}

// Context Class: PaymentContext
class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}



public class Strategy {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876"));
        context.pay(100);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.pay(200);

        // Pay using Bank Transfer
        context.setPaymentStrategy(new BankTransferPayment("123456789"));
        context.pay(300);
    }
}
