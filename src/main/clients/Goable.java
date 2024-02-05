package main.clients;

@FunctionalInterface
public interface Goable {
/*    public static final List<Integer> pi = new ArrayList<>();*/
    void toGO();
    default  double getRunSpeed(){
        return 10D;
    }

}
