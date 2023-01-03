package dz6;

public class cat extends animal{

    public static int countCat = 0;

    public static String typeThisClass = "Кот";

    cat(String name, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected int swim(float distance) {
        return animal.SWIM_NONE;
    }

    @Override
    protected void info() {
        System.out.println("cat");
    }
}

