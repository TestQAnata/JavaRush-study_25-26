package JavaSyntax.ModuleOne;

import java.util.Scanner;

public class LevelSeven {
    public static int[][] array = new int[3][3];//задача 5
//    public static int[][] array = new int[2][3];//задача 4
//    public static int[][] multiArray;//задача 2
//    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};//задача 3
    public static void main(String[] args) {
//1. Создай треугольный массив, где значение каждого элемента — это сумма его индексов.
//        int[][] array = new int[10][];
//        array[0] = new int[1];
//        array[1] = new int[2];
//        array[2] = new int[3];
//        array[3] = new int[4];
//        array[4] = new int[5];
//        array[5] = new int[6];
//        array[6] = new int[7];
//        array[7] = new int[8];
//        array[8] = new int[9];
//        array[9] = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = i + j;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

 //2. Создай двумерный массив. Для этого реализуй метод main(String[]), который:
        //Считывает из консоли число N — количество строк массива
        // (считай, что это число будет больше 0, можно не проверять).
        //Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
        //Инициализирует двумерный массив multiArray:
        //количеством строк N;
        //строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        multiArray = new int[N][];
//        for (int i = 0; i < multiArray.length; i++) {
//            int size = scanner.nextInt();
//            multiArray[i] = new int[size];
//        }


//3. В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.
//Требования:
//•	В классе Solution должна быть публичная статическая переменная multiArray типа int[][][].
//•	В методе main(String[]) выведи на экран все числа из multiArray.
//        for (int i = 0; i < multiArray.length; i++) {
//            for (int j = 0; j < multiArray[i].length; j++) {
//                for (int k = 0; k < multiArray[i][j].length; k++) {
//                    System.out.print(multiArray[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//        }

//4. В классе Solution проинициализируй поле array значением двумерного массива
// целых чисел размерностью 2х3. В методе main заполни этот массив целыми числами
// (кроме 0) и выведи на экран.

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = 3;
//                System.out.print(array[i][j] + " ");
//            }
//        }

//5. В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3.
// В методе main нужно заполнить построчно этот массив данными с клавиатуры и
// вывести на экран максимальный элемент массива.
//        Scanner scanner = new Scanner(System.in);
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                int num = scanner.nextInt();
//                array[i][j] = num;
//                if (num > max)
//                    max = num;
//            }
//        }
//        System.out.println(max);

//6. В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3.
// В методе main нужно заполнить построчно этот массив данными с клавиатуры,
// посчитать сумму элементов в каждом столбце и в каждой строке
// и вывести наименьшую из этих сумм на экран.
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;



    }
}

