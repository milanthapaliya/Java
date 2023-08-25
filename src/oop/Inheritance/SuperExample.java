package oop.Inheritance;

public class SuperExample {
    /*
        The super keyword is similar to this keyword. Following are the scenarios where the super keyword is used.
            1. It is used to differentiate the members of superclass from the members of subclass, if they have same names.
            2. It is used to invoke the superclass constructor from subclass.
     */

    public static void main(String[] args) {
        SemiTruck semiTruck = new SemiTruck(8);
        semiTruck.getWheelCount();
    }

}

class Truck{
    int wheelCount;
    Truck(){
        /*
         If a superclass has a parameterized constructor (a constructor that takes one or more parameters),
         and you do not provide any constructors in the subclass, the compiler will not
         automatically generate a default (no-argument) constructor for the subclass.
         */
        System.out.println("Super class default constructor called"); // This wont be shown as subclass is calling parameterized constructor.
    }
    Truck(int wheelCount){
        this.wheelCount = wheelCount;
    }

    public void getWheelCount() {
        System.out.println("Wheel Count is " + wheelCount);
    }
}
class SemiTruck extends Truck{
    int wheelCount;
    SemiTruck(int wheelCount){
        /*
        If a class is inheriting the properties of another class, the subclass automatically acquires the default
        constructor of the superclass. But if you want to call a parameterized constructor of the superclass,
        you need to use the super keyword as shown below.
         */
        super(wheelCount + 4);
        this.wheelCount = wheelCount;
    }
    public void getWheelCount() {
        super.getWheelCount();
        System.out.println("Wheel Count is " + wheelCount);
    }

}

