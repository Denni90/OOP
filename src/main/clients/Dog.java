package main.clients;
import java.time.LocalDate;
public class Dog extends Animal implements Goable, Huntable {
    Double discount;

    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public String getType() {
        return getClass().getSimpleName();
    }
/*
    public void Action(String Action) {
        Animal goodBoy = new Dog();
        if (Action.equals("toGo")){
            goodBoy.toGO();}
            else if (Action.equals("swim")) {
            goodBoy.swim();}
            else {
            goodBoy.canNot();
        }
    }
*/

    public Dog() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }


    @Override
    public void eat() {
        System.out.println(("Собака ест мясо"));
    }
    @Override
    public void toGO() {
        System.out.println("Животное умеет ходить");
    }
}
