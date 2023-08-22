package oop.abstraction;


/*
    1. Abstraction is the process of hiding the unnecessary complexity from the user
    2. Sometimes cases arises where methods are mandatory to be implemented by subclasses
    3. Abstract Class cannot be instantiated, but it can be subclassed
    4. Abstract methods are methods without body and they can only be implemented inside abstract class
    5. An abstract method is a method that is declared but not defined in a class. It acts as a placeholder for methods that must be implemented in subclasses
 */


public class AbstractClass {

    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
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
abstract class Vehicle {
    protected int speed = 0;

    public abstract void accelerate();

    public int getSpeed() {
        return speed;
    }

    public void decelerate(){
        speed--;
    }
}

class Car extends Vehicle {
    @Override
    public void accelerate(){
        speed++;
    }
}
class Bike extends Vehicle {
    @Override
    public void accelerate(){
        speed = speed +2;
    }
}
