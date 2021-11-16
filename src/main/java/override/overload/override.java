package override.overload;

public class override {
    class car {
        String method(){
            return ("info abut car");
        }
    }
    class sport_car extends car{
        @Override
        String method(){
            return ("Audi R8");
        }

    }
    public class OverideExample {
        public  void main(String[] args) {
         car car = new car();
         car sport_car = new sport_car();

         System.out.println(car.method());
         System.out.println(sport_car.method());
        }
    }
}
