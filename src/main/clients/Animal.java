package main.clients;

import java.time.LocalDate;

public abstract class Animal {
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;


    //Пустой конструктор по умолчанию

    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }


    public Animal() {
        this("Кличка", new Owner("Хозяин"), LocalDate.now(), new Illness("Болеет"));
    }

// Тестирование

    /**
     * public Animal() {
     * this.nickName = "Кличка";
     * this.owner = new Owner("Хозяин");
     * this.birthDate = LocalDate.now();
     * this.illness = new Illness("Болеет");
     * }

     public Animal() {
     this.nickName = "Кличка";
     this.owner = new Owner("Хозяин");
     this.birthDate = LocalDate.now();
     this.illness = new Illness("Болеет");
     }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }


    public String getType() {
        return getClass().getSimpleName();
    }



    public void setIllness(Illness illness) {

        this.illness = illness;
    }

    public void lifeCycle() {
        wakeUP("12.30");
        hunt();
        eat();
        sleep();
    }

    private void wakeUP() {
        System.out.println("Животное проснулось");
    }

    private void wakeUP(String time) {
        System.out.println("Животное" + nickName + "проснулось в " + time);
    }

    private void hunt() {
        System.out.println("Животное охотится");
    }

    private void eat() {
        System.out.println("Животное ест!");
    }

    private void sleep() {
        System.out.println("Животное уснуло");
    }

    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }
<<<<<<< HEAD


        public void swim() {
            System.out.println("Животное плавает");
        }
        public void toGO() {
            System.out.println("Животное двигается");
        }
        public void fly() {
            System.out.println("Животное летает");


*/
    public void swim() {
    System.out.println("Животное умеет плавать ");
    }
 /**   public void toGO() {
        System.out.println("Животное умеет ходить");
    }*/
    public void fly() {
        System.out.println("Животное умеет летать");
    }
    public void canNot() {
        System.out.println("Животное не умеет этого");

    }

    public void meow() {System.out.println("Животное умеет мяукать ");
    }

    public abstract void eat();
}






