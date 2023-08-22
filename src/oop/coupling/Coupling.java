package oop.coupling;

public class Coupling {
}

class A{

    // A class that directly instantiates another class
    /*
    Direct Instantiation (Tight Coupling):
        In this example, class A directly creates an instance of class B using new B().
        This results in a tight coupling between the two classes, as A is directly dependent
        on the specific implementation of B.
     */
    B b = new B();

    // A class that calls method on another class directly by its name
    /*
    Method Call by Name (Tight Coupling):
        The method getClassName() in class B is called directly from class A using the method name.
        While this is looser than direct instantiation, it still demonstrates some level of coupling,
        as class A needs to know the method name in class B to call it.
     */
    void getCLassName(){
        B.getClassName();
    }

    // A class that passes reference to another class as parameter
    /*
    Method Call by Name (Tight Coupling):
        The method getClassName() in class B is called directly from class A using the method name.
        While this is looser than direct instantiation, it still demonstrates some level of coupling,
        as class A needs to know the method name in class B to call it.
     */

    void getDetail(B b){

    }
}
class B{
    public static void getClassName(){
        System.out.println("Class B");
    }
}
