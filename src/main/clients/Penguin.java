package main.clients;

import java.time.LocalDate;

public abstract class Penguin extends Animal{
    Double discount;
    public Penguin(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Penguin() {
        super();
        this.discount = 10D;
    }

    @Override
    public void eat() {
        System.out.println(("Пингвин есть!!!"));
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
