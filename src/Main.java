import java.util.List;

public class Main {
    private static final int TOTAL_TURN=7;
    private static final int GAS_LOSS=5;
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Honda", "CR-V", 2023, "Red", 50000, 45),
                new Car("Ford", "F-150", 2020, "Black", 25000, 30),
                new Car("BMW", "X5", 2022, "Green", 60000, 65),
                new Car("Mazda", "CX-5", 2019, "White", 15000, 60),
                new Car("Audi", "Q7", 2018, "Silver", 52000, 47),
                new Car("Kia", "Forte", 2020, "Blue", 21000, 56)

        );
        System.out.println("***** calling honk method *******");
        cars.forEach(Car::honk);

        for (int i = 0; i < TOTAL_TURN; i++) {
            for (Car car :
                    cars) {
                if(car.getYear()<2023){
                    int newGas = car.getGas() -(GAS_LOSS+(2023-car.getYear()));
                    car.setGas(newGas);
                }
                else{
                    car.setGas(car.getGas()-GAS_LOSS);
                }
            }
        }

        System.out.println("******* GAS REMAINING ********");

        cars.forEach(car->System.out.printf("%s : %s - Remaining gas: %d liters\n",car.getBrand(),car.getModel(),car.getGas()));
    }
}