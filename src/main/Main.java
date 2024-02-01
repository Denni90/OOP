package main;
import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args){


        Animal cat = new Cat();
        Animal goodBoy = new Dog();
        Animal Fish = new Fish();
        Animal duck = new Duck();

    Cat Cat = new Cat();
    System.out.println(Cat.getType());
    Cat.Action("fly");
    Cat.Action("toGo");
    Cat.Action("swim");

    Dog Dog = new Dog();
    System.out.println(Dog.getType());
    Dog.Action("fly");
    Dog.Action("swim");
    Dog.Action("toGo");

    Duck Duck = new Duck();
    System.out.println(Duck.getType());
    Duck.Action("fly");
    Duck.Action("swim");
    Duck.Action("toGo");

    Fish fish = new Fish();
    System.out.println(fish.getType());
    fish.Action("fly");
    fish.Action("swim");
    fish.Action("toGo");




/**
        Animal cat = new Animal("Солнышко", new Owner("Денис Сергеевич"),
                LocalDate.of(2020,12,5), new Illness("Лишай")); // Экземпляр класса



       System.out.println(cat.getNickName());
       System.out.println(cat.getOwner());
       System.out.println(cat.getBirthDate());
       System.out.println(cat.getIllness());

       cat.setIllness(new Illness("Здоров"));
        System.out.println(cat.getIllness());
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());


        System.out.println(cat.getType());

        cat.lifeCycle();


        Animal catty = new Cat();
        System.out.println(catty.getType());
        Dog goodBoy = new Dog();
        System.out.println(goodBoy.getType());
        Cat.meow();


        List<Animal> animals = new ArrayList<Animal>();
        animals.add(catty);
        animals.add(goodBoy);


        int i = 0;
        for(Animal animal : animals){
            System.out.println((i + " " + animal));
            i++;
        }

        System.out.println(cat);
 */

        // Тестирование
/**

        Animal testAnimal = new Animal();y

        Animal testAnimal = new Animal();

        System.out.println(testAnimal.getNickName());


        Animal ducky = new Duck();
        System.out.println(ducky.getNickName());
        System.out.println(ducky.getOwner());
        System.out.println(ducky.getBirthDate());
        System.out.println(ducky.getIllness());
        System.out.println(ducky.getType());
        System.out.println(ducky);*/
    }

}