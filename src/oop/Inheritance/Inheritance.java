package oop.Inheritance;

public class Inheritance {
    /*
    1. On the basis of class there are 3 types of Inheritance in Java: Single, Multilevel and Hierarchical
    2. Multiple and Hybrid Inheritance is supported through Interface only
     */
    public static void main(String[] args) {
        // Single Inheritance  class B extends class A
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.accelerate();
        twoWheeler.honk();

        // Multilevel Inheritance class B extends class A; class C extends class B,...
        Scooter scooter = new Scooter();
        scooter.honk();
        scooter.seatingCapacity();

        // Hierarchical Inheritance class B extends class A; class C extends class A;
        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.accelerate();
        fourWheeler.wheelsCount();
    }

}

class Vehicle{
    public void accelerate(){
        System.out.println("Accelerating");
    }
}
class TwoWheeler extends Vehicle{
    public void honk(){
        System.out.println("Honking!");
    }
    public void wheelsCount(){
        System.out.println("Two Wheels");
    }
}

class FourWheeler extends Vehicle{
    public void wheelsCount(){
        System.out.println("Four Wheels");
    }

}

class Scooter extends TwoWheeler{
    public void seatingCapacity(){
        System.out.println("Seating Capacity is two");
    }
}
