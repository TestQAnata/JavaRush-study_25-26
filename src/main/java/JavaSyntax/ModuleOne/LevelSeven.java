package JavaSyntax.ModuleOne;

import java.util.Scanner;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class LevelSeven {
//    public static char[][] chars = {
//            {'a', 'b', 'c', 'd', 'e', 'f'},
//            {'j', 'h', 'i', 'j', 'k', 'l'},
//            {'m', 'n', 'o', 'p', 'q', 'r'},
//            {'s', 't', 'u', 'v', 'w', 'x'}};//задача 9

    //    public static char[][] array = new char[][];// задача 8
//    public static int[][] array = new int[3][3];//задача 5, 6, 7
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
//        Scanner scanner = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            int sumRow = 0;
//            for (int j = 0; j < array[i].length; j++) {
//                int num = scanner.nextInt();
//                array[i][j] = num;
//                sumRow += num;
//            }
//            if (sumRow < min)
//                min = sumRow;
//        }
//        for (int col = 0; col < 3; col++) {
//            int sumCol = 0;
//            for (int row = 0; row < 3; row++) {
//                sumCol += array[row][col];
//            }
//            if (sumCol < min) {
//                min = sumCol;
//            }
//        }
//        System.out.println(min);


        //7. В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3. Необходимо:
        //построчно заполнить этот массив числами с клавиатуры;
        //перевернуть массив относительно главной диагонали (у главной диагонали есть свойство i == j);
        //вывести перевернутый массив на экран в таком виде,
        // как в примере — каждую строку отдельно, элементы в строке через пробел.
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = scanner.nextInt();
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = i + 1; j < 3; j++) {
//                int temp = array[i][j];
//                array[i][j] = array[j][i];
//                array[j][i] = temp;
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }


//8. Напишем программу для рисования пирамиды с заданной высотой.
//В классе Solution дан двумерный массив символов (поле array). Необходимо:
//считать число с клавиатуры — это и будет высота пирамиды;
//инициализировать массив array соответствующим значением;
//заполнить массив так, чтобы получилась пирамида (клетки, составляющие пирамиду, заполнить символами '#', фон - ' ', см. пример);
//вывести массив на экран в таком виде, как в примере (каждую строку отдельно).
//        Scanner scanner = new Scanner(System.in);
//        int height = scanner.nextInt();
//        int weight = 2 * height - 1;
//        array = new char[height][weight];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = ' ';
//            }
//        }
//        int centr = weight/2;
//        for (int i = 0; i < array.length; i++) {
//            int left = centr - i;
//            int right = centr + i;
//            for (int j = left; j <= right ; j++) {
//                array[i][j] = '#';
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }

//9. Дан двумерный массив chars. Тебе нужно
// в методе main заменить все внутренние элементы на дефис (минус).
//Для вывода содержимого массива на экран используй приватный метод printArray().
//        printArray();
//        for (int i = 1; i < chars.length - 1; i++) {
//            for (int j = 1; j < chars[i].length - 1; j++) {
//                chars[i][j] = '-';
//            }
//
//        }//напишите тут ваш код
//
//        printArray();
//    }
//
//    private static void printArray() {
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = 0; j < chars[i].length; j++) {
//                System.out.print(chars[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }


    }
}

