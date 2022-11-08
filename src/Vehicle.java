public abstract class Vehicle {
    public String brand;
    public int kilometers;

    public  Vehicle (String brand, int kilometers ) {
        this.brand = brand;
        this.kilometers = kilometers;
    }
    public String getBrand() {
        return this.brand;
    }

    public int getKilometers(){
        return this.kilometers;
    }

    public void setBrand(String brand) {
        this.brand =  brand;
    }
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
    public abstract String doStuff();
}

