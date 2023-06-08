import Inheritance.SubClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Success");
        SubClass subClass = new SubClass("Base Secret", "Sub Secret");
        String subSecret = subClass.getSubSecretKeySecretKey();
        String baseSecret = subClass.getSecretKey();
        System.out.println(baseSecret + " Is base secret and sub secret is " + subSecret);
    }
}
