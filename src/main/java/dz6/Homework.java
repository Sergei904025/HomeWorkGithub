package dz6;

public class Homework {
    public static void main(String[] args) {

        String win = " это получилось";
        String loss = " это не получилось";
        String eventName;
        String eventResult;

        cat cat1 = new cat(" Барсик ", 2, 200);
        cat cat2 = new cat(" Мурзик ", 5, 400);
        Dog dog1 = new Dog(" Тузик ", 0.5f, 500);
        Dog dog2 = new Dog(" Бобик ", 1.5f, 350);

        animal[] animals = {cat1, cat2, dog1, dog2};

        float runLength = 250;
        float swimLength = 8;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может ";

            eventName = " пробежать на " + animals[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = animals[i].run(runLength) ? win : loss;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = " проплыть на " + animals[i].getMaxSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == animal.SWIM_OK) ? win : loss;


            if (swimResult == animal.SWIM_NONE)
                eventResult = " это не получилось, т.к. не умеет плавать";
                result(nameString, eventName, swimLength, eventResult);


        }
            System.out.println("All animals = " + animal.countAnimal + " > cat count = " + cat.countCat + " > dog count = " + Dog.countDog);
    }

    private static void result(String nameanimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameanimal + event + eventLength + " м и " + resultEvent);
    }

}
