package Inheritance;

public class SubClass extends BaseClass {
    private String subSecretKey;
    public SubClass(String secretKey, String baseSecretKey) {
        super(secretKey);
        this.subSecretKey = baseSecretKey;
    }

    public String getSubSecretKeySecretKey() {
        return subSecretKey;
    }
}
