package oop.access_modifier.example;

//import oop.access_modifier.DefaultClassExample;

public class AccessModifierExample {

    public static void main(String[] args) {

        // The line below will show error as default class cannot be accessed outside from its package
       // DefaultClassExample defaultClass = new DefaultClassExample();   ---> ERROR

        Student s = new Student("Student 1",  20, 1);
        s.showDetails();
        s.age = 25;
        s.name = "Milan Thapaliya";
        s.showDetails();

    }
}

class Person{ // default class
    String name; // default access modifier(accessible from same package)
    protected int age; // protected access modifier(accessible from same package or subclass from other packages)
    private int id; // private access modifier(accessible only from the class)
    Person(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void showDetails(){
        System.out.println("name = " + this.name + " age = " + this.age + " ID = " + this.id);
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
class Student extends Person{
    Student(String name, int age, int id){
       super(name, age, id);
    }
}

