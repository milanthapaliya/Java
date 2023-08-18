package oop.abstraction;


/*
    1. Abstraction is the process of hiding the unnecessary complexity from the user
    2. Some times cases arises where methods are mandatory to be implemented by subclasses
    3. Abstracts methods are methods without body and they can only be implemented inside abstract class
    4. An abstract method is a method that is declared but not defined in a class. It acts as a placeholder for methods that must be implemented in subclasses
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
    }


}
abstract class Accelerate{
    protected int speed = 0;

    public abstract void accelerate();

    public int getSpeed() {
        return speed;
    }
}

class Car extends Accelerate{
    @Override
    public void accelerate(){
        speed++;
    }
}
class Bike extends Accelerate{
    @Override
    public void accelerate(){
        speed = speed +2;
    }
}
