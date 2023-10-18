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
    public static void main(String[] args) {
        printNumbersOneToTenRecursively(1);
    }
}
