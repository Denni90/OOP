/*
package main.clients;

import java.util.ArrayList;
import java.util.List;

public class NewHomework {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Cat cat = new Cat();
        Shark shark = new Shark();
        Penguin penguin = new Penguin();

        animals.add(shark);
        animals.add(cat);
        animals.add(penguin);
        animals.add(cat);

        for (int i = 0; i < animals.size(); i++) {
         Animal an = animals.get(i);
////            ((Cat) an).meow();
////    }
//
//            if (an instanceof Cat) {
//                ((Cat) an).meow();
//            }

//            if (((Cat) an).getType().equals("Cat")) {
//                ((Cat) an).meow();
//            }

            try {
                ((Cat) an).meow();
            } catch (ClassCastException e) {
                i++;
                an = animals.get(i);
                ((Cat) an).meow();
            }

        }
    }
}
*/
