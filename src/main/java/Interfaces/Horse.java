package Interfaces;

import org.testng.annotations.Test;

public class Horse implements Sounds{


    @Override
    public String getType() {
        return null;
    }
    @Test
    @Override
    public void getSound() {
System.out.println("Igogo");
    }
}
