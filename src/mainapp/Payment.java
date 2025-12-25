package mainapp;

public class Payment {
    private double transactionAmount;
    private String paymentMethod;

    public Payment(double transactionAmount, String paymentMethod) {
        this.transactionAmount = transactionAmount;
        this.paymentMethod = paymentMethod;
    }

    public void calculateAppointmentFee() {
        System.out.println("The appointment fee is: " + transactionAmount);
    }

    public void processPayment() {
        System.out.println("Processing payment of " + transactionAmount + " using " + paymentMethod);
    }

    public void generateInvoice() {
        System.out.println("Generating invoice for amount: " + transactionAmount);
    }
}
