package Java_Exceptions;

import java.time.LocalDate;

public class DebitCard {
    private String name;
    private double amount;
    private boolean blocked;
    private LocalDate available;
    private int limit;
    private int pinCode;

    public DebitCard(String name, double amount, boolean blocked, int limit, LocalDate available, int pinCode) {
        this.name = name;
        this.amount = amount;
        this.blocked = blocked;
        this.available = available;
        this.limit = limit;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void purchase(int price) throws DebitCardExceptions {
        if (price > this.amount) throw new DebitCardExceptions();
    }

    public void isBloked() throws DebitCardExceptions {
        if (this.blocked == true) throw new DebitCardExceptions();
    }

    public void overLimit(int price) throws DebitCardExceptions {
        if (price > limit) throw new DebitCardExceptions();
    }

    public void expiryDate(LocalDate date) throws DebitCardExceptions {
        if (this.available.isBefore(date)) throw new DebitCardExceptions();
    }

    public void introducePinCode(int a) throws DebitCardExceptions {
        if (a != pinCode) throw new DebitCardExceptions();

    }


}


