package main;

import main.clients.Animal;
import main.clients.Cat;
import main.clients.Dog;
import main.clients.Goable;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Goable> list =new ArrayList<>();

    Cat cat = new Cat();
    Dog Dog = new Dog();
        list.add(cat);
        list.add(Dog);
        System.out.println((list));
        Animal animal = new Animal() { // Анонимный класс
            @Override
            public void eat() {

            }
        };
    }
}
