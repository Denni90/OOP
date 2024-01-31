package main;
import main.clients.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    
    public static void main(String[] args){

        Animal cat = new Cat();
        Animal goodBoy = new Dog();
        Animal fish = new Fish();
        Animal duck = new Duck();



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