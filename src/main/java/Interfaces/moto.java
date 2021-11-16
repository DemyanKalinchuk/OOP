package Interfaces;

public class moto implements moto_bike_havy, Sport_moto {


    @Override
    public void max_speed() {
        System.out.println("max speed for two classes moto = 250km");
    }
}
