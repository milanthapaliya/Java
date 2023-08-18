package oop.abstraction;

interface InterfaceDemo {
    void accelerate();
}

class VehicleDemo {
    public int getSpeed() {
        return speed;
    }

    protected int speed = 0;

    public void decelerate(){
        speed--;
    }

}

class BikeDemo extends VehicleDemo implements InterfaceDemo{
    @Override
    public void accelerate(){
        speed = speed + 2;
    }
}
class CarDemo extends VehicleDemo implements InterfaceDemo{
    @Override
    public void accelerate(){
        speed++;
    }
}
public class InterfaceExample{
    public static void main(String[] args) {
        BikeDemo bike = new BikeDemo();
        CarDemo car = new CarDemo();
        car.accelerate();
        bike.accelerate();
        System.out.println("Car Speed is " + car.getSpeed() + " Bike speed is " + bike.getSpeed()); //Car Speed is 1 Bike speed is 2
        car.accelerate();
        bike.accelerate();
        System.out.println("Car Speed is " + car.getSpeed() + " Bike speed is " + bike.getSpeed()); //Car Speed is 2 Bike speed is 4
        car.decelerate();
        bike.decelerate();
        System.out.println("Car Speed is " + car.getSpeed() + " Bike speed is " + bike.getSpeed()); //Car Speed is 1 Bike speed is 3
    }

}
