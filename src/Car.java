public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private int gas;

    public Car(String brand, String model, int year, String color, double price, int gas) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.gas = gas;
    }

    public int getYear(){
        return year;
    }

    public void setGas(int gas){
        this.gas = gas;
    }

    public int getGas(){
        return gas;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void honk() {
        System.out.println("Tuut tuut");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", gas=" + gas +
                "}\n";
    }
}
