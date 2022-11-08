public class Car extends Vehicle{
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "je suis " + getBrand() + "et je fais vroum vroum ! " ;
    }


}
