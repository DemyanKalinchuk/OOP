package Interfaces;

import org.testng.annotations.Test;

public class moto implements moto_bike_havy, Sport_moto {

@Test
    @Override
    public void max_speed() {

        System.out.println("max speed for two classes moto = 250km");
    }
}
