package main.clients;
import java.time.LocalDate;
    public abstract class Fish extends Animal implements Huntable {
        Double discount;
        public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
            super(nickName, owner, birthDate, illness);
            this.discount = discount;
        }

        public String getType() {
            return getClass().getSimpleName();
        }
        public void Action(String Action) {
            Animal fish = new Fish() {
                @Override
                public void eat() {

                }
            };
            if (Action.equals("swim")) {
                fish.swim();
            } else {
                fish.canNot();
            }
        }

        public Fish() {
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
