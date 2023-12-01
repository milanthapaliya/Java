package recursion;

public class RecursionExample {
    static public void infiniteRecursiveMethod(){  // Exception in thread "main" java.lang.StackOverflowError
        infiniteRecursiveMethod();
    }
    static public void printNumbersOneToTenRecursively(int n){ // This method will print numbers upto 10 recursively starting from n
        if(n <= 10){ // finite recursion
            System.out.println(n);
            printNumbersOneToTenRecursively(n + 1);
        }
    }
    static public int factorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else if (n == 0 || n == 1) {
            return 1;
        } else{
            return n * factorial(n-1);
        }
    }
    /*
    factorial(5) = 5 * factorial(4)
              = 5 * (4 * factorial(3))
            = 5 * (4 * (3 * factorial(2)))
            = 5 * (4 * (3 * (2 * factorial(1))))
            = 5 * (4 * (3 * (2 * 1)))  // factorial(1) returns 1
            = 5 * (4 * (3 * 2))
            = 5 * (4 * 6)
            = 5 * 24
            = 120

     */
    public static void main(String[] args) {
//        printNumbersOneToTenRecursively(1);
         System.out.println(factorial(5));
    }
}
