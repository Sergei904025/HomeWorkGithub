package dz1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        printcheckSumSign();
        printColor();
        compareNumbers();
    }


    private static void printThreeWords() {
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }

    private static void printcheckSumSign() {
        int varA = 8;
        int varB = 5;
        System.out.println(varA + varB);


        if (varA + varB >= 0) {
            System.out.println("сумма положительная");
        }

        if (varA + varB < 0) {
            System.out.println("сумма отрицательная");
        }


    }

    private static void printColor() {
        int value = 200;

        if (value <= 0) {

            System.out.println("красный");
        }
        if (value > 0 && value <= 100) {

            System.out.println("желтый");
        }
        if (value > 100) {

            System.out.println("зеленый");
        }


    }

    private static void compareNumbers() {


        int A = 3;
        int B = 5;
        if (A >= B) {

            System.out.println("A >= B");
        }
        if (A < B) {

            System.out.println("A < B");
        }

    }
}