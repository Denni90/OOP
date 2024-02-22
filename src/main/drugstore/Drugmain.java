package main.drugstore;

import main.drugstore.componets.Azitronite;
import main.drugstore.componets.Penicillin;
import main.drugstore.componets.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drugmain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D,1);
        Component azitronite = new Azitronite("Azitronite",2D,14);
        Component penicillin = new Penicillin("Penicillin",2D,6);

        Pharmacy p1 = new Pharmacy();
                p1.addComponents(water, azitronite);
        Pharmacy2 p2 = new Pharmacy2();
                p2.addComponents(water, penicillin);
        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(azitronite, penicillin);

        List<Component> components = new ArrayList<>();;
        components.add(penicillin);
        components.add(azitronite);
        components.add(water);


        Collections.sort(components);
        System.out.println(components);

/**
        Iterator<Component> itterator = p1;
        while (itterator.hasNext()) {
            System.out.println(p1.next().toString());
        }

        for (Component c : p2) {
            System.out.println(c);
        }
*/
    }
}
