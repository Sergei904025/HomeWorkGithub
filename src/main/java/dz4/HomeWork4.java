    package dz4;

    import java.util.Random;
    import java.util.Scanner;

    public class HomeWork4 {
        public static final String HEADER_FIRST_SYMBOL = "*";
        public static final String SPACE_MAP_SYMBOL = " ";
        private static int SIZE = 3;
        private static final char DOT_EMPTY = '.';
        private static final char DOT_HUMAN = 'X';
        private static final char DOT_AI = 'O';

        private static final char[][] MAP = new char[SIZE][SIZE];

        private static final Scanner in = new Scanner(System.in);
        private static final Random random = new Random();


        public static void main(String[] args) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    MAP[i][j] = DOT_EMPTY;

                }
            }

            System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
            for (int i = 0; i < SIZE; i++) {
                System.out.print(i + 1 + SPACE_MAP_SYMBOL);
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print(i + 1 + SPACE_MAP_SYMBOL);
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
                }
                System.out.println();
            }

            while (true) {
                humanTurn();
                System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
                for (int i = 0; i < SIZE; i++) {
                    System.out.print(i + 1 + SPACE_MAP_SYMBOL);
                }
                System.out.println();
                for (int i = 0; i < SIZE; i++) {
                    System.out.print(i + 1 + SPACE_MAP_SYMBOL);
                    for (int j = 0; j < SIZE; j++) {
                        System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
                    }
                    System.out.println();
                }
                if (false/*проверка на конец игры*/) {
                    break;
                }

                aiTurn();
                System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
                for (int i = 0; i < SIZE; i++) {
                    System.out.print(i + 1 + SPACE_MAP_SYMBOL);
                }
                System.out.println();
                for (int i = 0; i < SIZE; i++) {
                    System.out.print(i + 1 + SPACE_MAP_SYMBOL);
                    for (int j = 0; j < SIZE; j++) {
                        System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
                    }
                    System.out.println();
                }
                if (false/*проверка на конец игры*/) {
                    break;
                }
            }
        }

        private static void humanTurn() {
            System.out.println("\nХОД ЧЕЛОВЕКА!");

            int rowNumber;
            int columnNumber;


            while (true) {
                System.out.println("Введите координату строки: ");
                rowNumber = in.nextInt() - 1;
                System.out.println("Введите координату столбца: ");
                columnNumber = in.nextInt() - 1;

                if (isCellFree(rowNumber, columnNumber)) {
                    break;
                }
                System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется%n", rowNumber + 1, columnNumber + 1);
            }
            MAP[rowNumber][columnNumber] = DOT_HUMAN;


        }

        private static boolean isCellFree(int rowNumber, int columnNumber) {
            return true;
        }




        private static void aiTurn() {
            System.out.println("\nХОД КОМПЬЮТЕРА!");
            int rowNumber;
            int columnNumber;


            do {
                rowNumber = random.nextInt(SIZE);
                columnNumber = random.nextInt(SIZE);


            } while (!isCellFree(rowNumber, columnNumber));
            MAP[rowNumber][columnNumber] = DOT_AI;


        }
    }




