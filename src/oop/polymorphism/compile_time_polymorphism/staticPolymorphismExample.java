package oop.polymorphism.compile_time_polymorphism;

public class staticPolymorphismExample {

    //ways to achieve method overloading:
    // 1. By changing the number of parameters

        public void sum(int a, int b){
                System.out.println("SUM = " + a+b);
        }
        public void sum(int a, int b, int c){
                System.out.println("SUM = " + a+b+c);
        }
    // 2. By changing data types of parameters

        public void multiply(int a, int b){
                System.out.println("Product = " + a*b);
        }
        public void multiply(double a, int b){
                System.out.println("Product = " + a*b);
        }

        public static void main(String[] args) {
                staticPolymorphismExample s = new staticPolymorphismExample();
                s.sum(1,2);
                s.sum(1,2,3);
                s.multiply(1,2);
                s.multiply(0.5,2);
        }

        /*
                NOTE: Method overloading cannot be done by changing the return type of methods.
                The most important rule of method overloading is that two overloaded methods must have different parameters.
         */
        //https://www.mygreatlearning.com/blog/method-overloading-in-java/#:~:text=Method%20overloading%20in%20java%20is,name%2C%20but%20with%20different%20parameters.

}
