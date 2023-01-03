package dz7;

public class main {
    public static void main(String[] args) {

        cat cat = new cat("barsik", 15);
        plate plate = new plate(50);
        plate.info();

//        plate.setFood(plate.getFood() - cat.getAppetite());
        cat.eat(plate);
        plate.info();

    }
}
