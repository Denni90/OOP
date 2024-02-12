package main.clients;
@FunctionalInterface
public interface Swimable {

    void swim();
    default double getSwimSpeed(){
        return 10;
    }
}
