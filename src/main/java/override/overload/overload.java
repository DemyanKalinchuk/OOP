package override.overload;

import java.io.IOException;

public class overload {
    public static int sumchislo (int a, int b) throws IOException {
        return a + b;
    }
    protected final float sumchislo (double a, double b) throws RuntimeException {
      return (float) (a * b);
    }

    public static void main(String[] args) throws Exception{
        overload overload = new overload();
        System.out.println(overload.sumchislo(20, 33));
        System.out.println(overload.sumchislo(11.2, 5.5));
    }
}
