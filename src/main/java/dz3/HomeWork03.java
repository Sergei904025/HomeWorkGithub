package dz3;

import java.util.Arrays;

public class HomeWork03 {
    public static int[] chenging01(int[] array) {
        System.out.println("Задание 1");
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    public static void createArr(int[] array, int step, int shift) {
        System.out.println("Задание 2");
        for (int i = 0; i < 100; i++) {
            array[i] = shift + i * step;
        }
    }

    public static void modifierForArrayes(int[] array) {
        System.out.println("Задание 3");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void createSquareArray(int size) {
        int[][] sqrArray = new int[size][size];
        System.out.println("Задание 4");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqrArray[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        //1
        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(chenging01(array01)));

        //2

        int[] arr2 = new int[100];
        System.out.println("before:" + Arrays.toString(arr2));
        createArr(arr2, 1, 1);
        System.out.println("after: " + Arrays.toString(arr2));

        //3
        int[] arrayNumbers = {2, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifierForArrayes(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));



        //4
        createSquareArray(5);


    }
}