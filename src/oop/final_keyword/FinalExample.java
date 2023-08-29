package oop.final_keyword;

public class FinalExample {

    public static void main(String[] args) {
        Employee emp1 = new Employee("123");
        Employee emp2 = new Employee("456");
        emp1.showDetail();
        emp2.showDetail();
    }
}

class Bike{

    // The value of final variable cannot be changed.
    private final int minSpeed = 1;

    private final int maxSpeed; // Blank Final Variable(can be initialized in constructor only)

    Bike(){
        this.maxSpeed = 0;
    }

    Bike(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void setMinSpeed(int minSpeed){
       // this.minSpeed = minSpeed;   This will cause compile error
    }

    public final void run(){ // Cannot override final method
        System.out.println("Bike is Running");
    }

}
final class Honda extends Bike{ // Final class cannot be extended
/*
    @Override
    public void run(){   Error: Cannot override final method

    }
*/
}


// Demonstration of static final variable and final variable
//Static final variables are useful when you want to define a constant that is shared by all instances of a class
class Employee{
    private static final String EMPLOYER ; // all instances of Employee work in Google

    static{
        EMPLOYER =  "Google"; /* static final variable can be initialized either in declaration or
                                in static block. The static block will run when the class is loaded into
                                memory. This happens the first time the class is used, either by creating an
                                object of the class or by calling a method in the class.
                               */
    }
    private final String PAN_CARD; // Each instance of Employee have their own unmodifiable Pan Number

    Employee(String panNumber){
        this.PAN_CARD = panNumber;
    }

    public void showDetail(){
        System.out.println("Pan Number is " + this.PAN_CARD + " Employer is " + this.EMPLOYER);
    }
}


