package lesson1;

public class MainForLesson1 {

    public static void main(String[] args) {
        System.out.println("hello world!");
        System.out.println("hello world!"); //вывод текста на экран
        System.out.println("hello world!"); //вывод текста на экран
        System.out.println("hello world!"); //вывод текста на экран
printHello();
        printHello();
        printHello();
        testVars();

        checkAppraisal();


    }


    static void printHello() {
        System.out.println("Привет");
        System.out.println("Мы в методе");
    }

    private static void testVars() {
        int VarA;
        VarA = 9;
        int VarB = 5;
        System.out.println(1.0 * VarA / VarB);
        System.out.println((double) VarA / VarB);

        double varDoubleA = 9.1;
        double varDoubleB = 5.0;
        System.out.println(varDoubleA / varDoubleB);
        System.out.println(2.0 / 3);
        int result1 = (int) (VarA / varDoubleB);
        double result2 = VarA / varDoubleB;

        boolean isRed = false;


        char chr2 = 1234;

        System.out.println(chr2);
        String helloStr = "Hello";
        String worldStr = "world";
        System.out.println(helloStr + "," + worldStr + "!" + (3 + 5));
    }

    private static void checkAppraisal() {
        int appraisal = 4;
        System.out.println("Школьник принес оценку: " + appraisal);

        if (appraisal == 5) {

            System.out.println("Молодец, так держать!");
        }

         else if (appraisal == 4) {

            System.out.println("Молодец, но ты можешь лучше!");
        }
       else if (appraisal >= 1 && appraisal <= 3) {
            System.out.println("Готовь уроки лучше");

        } else {
            System.out.println("Не мухюй");
        }
System.out.println("Проверка дневника окончена");

        }
    }
