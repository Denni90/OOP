package main.clients;
import java.time.LocalDate;

public class Cat extends Animal {
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public String getType() {
        return getClass().getSimpleName();
    }
public static void Action(String Action) {
    Animal cat = new Cat();
    if (Action.equals("toGo")) {
        cat.toGO();
    } else {
        cat.canNot();
    }
}

    public Cat() {
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

