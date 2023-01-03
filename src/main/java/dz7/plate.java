package dz7;

public class plate {

    private int food;

    public plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info(){

        System.out.println("plate:" + food);
    }

    public void decreaseFood(int n){
        food -= n;

    }
}
