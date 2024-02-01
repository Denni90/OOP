package main.clients;
import java.time.LocalDate;
    public class Fish extends Animal {
        Double discount;
        public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
            super(nickName, owner, birthDate, illness);
            this.discount = discount;
        }

        public String getType() {
            return getClass().getSimpleName();
        }
        public void Action(String Action) {
            Animal fish = new Fish();
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
