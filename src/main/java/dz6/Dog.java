package dz6;

public class Dog extends animal {

    public static int countDog = 0;

    public static String typeThisClass = "ПЕС";

    public Dog(String name, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countDog;
    }

    @Override
    protected void info() {
        System.out.println("Dog");
    }
}