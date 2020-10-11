package Task2_Java_OOP;

public class SavingsAccount {
    static float annualInterestRate;
    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){
       savingsBalance+=(savingsBalance*annualInterestRate)/12;
       return savingsBalance;

    }
    public static double modifyInterestRate(float a){
        annualInterestRate=a;
        return annualInterestRate;

    }

}
