package main.clients;
import java.time.LocalDate;

public class Cat extends Animal implements  Goable, Huntable{
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
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

    /*
        public static void Action(String Action) {
            Animal cat = new Cat();
            if (Action.equals("toGo")) {
                cat.toGO();
            } else {
                cat.canNot();
            }
        }
        */
    public String getType() {
        return getClass().getSimpleName();
    }
    @Override
    public void eat() {
        System.out.println("Кошка просто ест");
    }
    @Override
    public void toGO() {
        System.out.println("Животное умеет ходить");
    }

}


