package arrays;


import java.util.Arrays;

class Student {
    private int rollNo;
    private String name;

    Student(int roll, String name){
        this.rollNo = roll;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class Array {
    public static void main(String[] args) {
        /*
            1. Fixed size data structure.
            2. Holds a fixed number of primitive values or references to object instances.
            3. The size of an array is fixed at runtime when initialized.
            4. If the size must be mutable at runtime, a Collection class such as ArrayList should be used instead.
         */

        int[] numbers1 = new int[3];                    // Array for 3 int values, default value is 0
        int[] numbers2 = {1,2,3};                       // Array literal of 3 int values
        int[] numbers3 = new int[]{1,2,3};              // Array of 3 int values initialized
        int[][] numbers4 = {{1,2}, {3,4,5}};            // Jagged array literal

        //Arrays may be created using any primitive or reference type.

        float[] boat = new float[5];                    // Array of five 32-bit floating point numbers
        double[] header = {4.56, 332.67};               // Array of two 64-bit floating point numbers

        //reference type
        /*Arrays of primitive data types (like double, int, boolean, etc.) are not reference types. They store the actual values directly in the array.
         Arrays of objects (like String, custom classes, etc.) are reference types. They store references to memory locations where the objects are stored.*/

        String[] theory = new String[]{"m","i","l","a","n"}; // Array of five strings (reference type)
        Object[] dArt = new Object[] { new Object(), "We love Stack Overflow.", 3 }; // Array of three Objects (reference type).

       // ways to iterate an array in traditional way
        for(int i = 0; i < numbers1.length; i++){ // supports both read and write
            System.out.println(numbers1[i]);
        }
        // extended for: read only
        for(int i : numbers2){                  // supports read only
            System.out.println(i);
        }

        // Array of Object
        Student[] myStudents = new Student[]{new Student(1,"Milan"), new Student(2, "Thapaliya")};
        for(Object student : myStudents){
            System.out.println(student);
        }


        // Cloning of Array
        int[] cloneArray = numbers1.clone();

        //Comparing Arrays for Equality


        System.out.println(numbers1 == cloneArray);             // will print false as deep copy is created for one-dimensional array
        System.out.println(numbers1.equals(cloneArray));        // false
        System.out.println(Arrays.equals(numbers1,cloneArray)); // true

        Student[] cloneStudent = myStudents.clone();
        System.out.println(Arrays.equals(myStudents,cloneStudent)); //true

        // To compare multidimensional arrays for equality, use Arrays.deepEquals() instead

        Object[] objA = {"a"};
        Object[] objB = {"b"};
        System.out.println(Arrays.deepEquals(objA, objB));       //false

    }
}
