package main.clients;

import java.time.LocalDate;

public class Duck extends Animal {

    Double discount;
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }
    public Duck() {
        super();
        this.discount = 10D;
    }
    public Double getDiscount() {
        return discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}