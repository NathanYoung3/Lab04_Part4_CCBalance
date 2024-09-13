public class Main {
    public static void main(String[] args) {
        double creditBalance = 5000;
        double interestRate = 0.17;

        creditBalance += creditBalance * interestRate;
        System.out.println("The balance of the credit card after one month is $" + creditBalance);
        creditBalance += creditBalance * interestRate;
        System.out.println("The balance of the credit card after two months is $" + creditBalance);
    }
}