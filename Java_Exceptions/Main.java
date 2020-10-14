package Java_Exceptions;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        DebitCard d1 = new DebitCard("Vadim", 2444.12, true, 500,
                LocalDate.of(2020, 10, 4), 3222);

        try {
            d1.purchase(20000);
        } catch (DebitCardExceptions e) {
            System.out.println("Sorry " + d1.getName() + ", you have insufficient funds");
        } finally {
            System.out.println("----------------");
        }
        try {
            d1.isBloked();
        } catch (DebitCardExceptions e) {
            System.out.println("Sorry " + d1.getName() + ",your credit card is blocked. Please contact your bank");
        } finally {
            System.out.println("----------------");
        }
        try {
            d1.overLimit(3000);
        } catch (DebitCardExceptions e) {
            System.out.println("Sorry " + d1.getName() + ", you have tried to pay for something which is over your pay limit");
        } finally {
            System.out.println("----------------");
        }
        try {
            d1.expiryDate(LocalDate.now());
        } catch (DebitCardExceptions e) {
            System.out.println("Sorry " + d1.getName() + ", unfortunately your debit card has expired");
        }
        {
            System.out.println("----------------");
        }
        try {
            d1.introducePinCode(3333);
        } catch (DebitCardExceptions e) {
            System.out.println("Sorry " + d1.getName() + ", unfortunately the pin code is incorect. Please try again");
        }
        {
            System.out.println("----------------");
        }

    }
}

