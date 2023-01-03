package dz2;

public class HomeWork02 {
    public static void main(String[] args) {

        int a;
        int b;
        doOne();
        System.out.println(doTwo(a = 5, b = 8));

        System.out.println(doThree(a = -1));
        doFour("строка", 7);

    }

    static void doOne() {
        int a = 7;
        System.out.println("Задание 1");
        if (a >= 0) System.out.println("Число " + a + "Положительное");
        else System.out.println("Число " + a + " отрицательное");
    }


    static boolean doTwo(int a, int b) {
        System.out.println("Задание 2");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        return false;
    }


    static boolean doThree(int a) {
        System.out.println("Задание 3");
        if (a < 0) return true;
        return false;
    }


    public static void doFour(String str, int n) {
        System.out.println("Задание 4");
        for (int i = 1; i <= n; i++) {
            System.out.println(" " + i + " " + " " + str);
        }

    }

}


