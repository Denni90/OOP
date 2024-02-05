package main.clients;

import java.time.LocalDate;

public abstract class Shark extends Animal implements Goable{
    Double discount;
    public Shark(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Shark() {
        super();
        this.discount = 10D;
    }

    @Override
    public void eat() {
        System.out.println(("Акула ест рыбу"));
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
