package oop.polymorphism.run_time_polymorphism;

public class dynamicPolymorphismExample {
    /*If subclass (child class) has the same method as declared in the parent class,
    it is known as method overriding in Java */

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.accelerate();
    }


}
class Vehicle{
    private int speed;
    public void accelerate(int factor){
        this.speed = this.speed + factor;
    }
    public void start(){
        System.out.println("Vehicle is Starting");
    }
    public static void fuelUp(){
        System.out.println("Fueling Up");
    }
}
class Bike extends Vehicle{

    // This is not function overriding since the parameters in the method is not same as in parent class
    public void accelerate(){
        System.out.println("Accelerating");
    }

    // This is overriding as the function name and signature matches with that of parent class
    public void start(){
        System.out.println("Bike is Starting");
    }

   /*
    we cannot override the static method since the method belongs to the class.
    It is because the static method is bound with class whereas instance method is bound with an object.
    Static belongs to the class area, and an instance belongs to the heap area.
    */
//    public void fuelUp(){
//
//    }
}
