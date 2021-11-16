package Interfaces;

public interface Sounds {
    String getType();

    default void getSound() {
System.out.println("booooooo");
    }

}
