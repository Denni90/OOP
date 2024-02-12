package main;
import main.clients.Cat;
import main.clients.Dog;
import main.clients.Goable;
import main.personnel.*;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    public static void main(String[] args){

        Doctor doctor = new Doctor();
        Assistant assistant1 = new Assistant();
        Assistant2 assistant2 = new Assistant2() {
            @Override
            public void setPlanned() {

            }
        };

        Nurse nurseOne = new Nurse() {
            @Override
            public void setOperatingRoom() {

            }
        };

        HeadNurse headNurse = new HeadNurse();


        List<MaintenancePersonel> personel = new ArrayList<>();
            personel.add(doctor);
            personel.add(assistant1);
            personel.add(assistant2);
            personel.add(nurseOne);
            personel.add(headNurse);
        System.out.println(("Кол-во персонала: " + personel.size()));
        System.out.println((personel));

        List<Goable> list = new ArrayList<>();

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        list.add(cat);
        list.add(cat1);
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        list.add(dog);
        list.add(dog1);
        System.out.println("Кол-во питомцев: " + list.size());
        System.out.println((list));


    }

}

