package Task2_Java_OOP;

public class TestSavingsAccount extends SavingsAccount  {
    public static void main(String[] args) {

    SavingsAccount saver1=new SavingsAccount();
    SavingsAccount saver2=new SavingsAccount();
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);
        modifyInterestRate(1.04f);
        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());
        modifyInterestRate(1.05f);
        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());
    }
}
