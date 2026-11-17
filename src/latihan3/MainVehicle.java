package latihan3;

interface Drivable {
    void drive();
}

interface ElectricPowered {
    void isiBaterai();
}

class ElectricCar implements Drivable, ElectricPowered {
    public void drive() {
        System.out.println("Mobil listrik berjalan...");
    }
    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil...");
    }
}

class Bicycle implements Drivable {
    public void drive() {
        System.out.println("Sepeda dikayuh di jalan...");
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.drive();
        car.isiBaterai();

        Bicycle bike = new Bicycle();
        bike.drive();
    }
}