package JavaSyntax.ModuleOne;

import java.util.Scanner;

public class LevelSix {
    public static void main(String[] args) {

//1.В методе main проинициализируй переменные intArray и doubleArray
// массивами соответствующих типов, размер которых равен 10.
//        int[] intArray = new int[10];
//        double[] doubleArray = new double[10];


//2.В методе main(String[]) тебе нужно заполнить массив strings значениями.
// Если индекс массива чётный - присвоить значение "Чётный"(ноль - цифра чётная),
// иначе присвоить "Нечётный". Вывод текста в консоль в тестировании не участвует.
//        String[] strings = new String[10];
//        for (int i = 0; i < strings.length; i++) {
//                strings[i] = (i % 2 == 0) ? "Чётный" : "Нечётный";
//            }
//
//            System.out.println(Arrays.toString(strings));


//3. Реализуй метод main(String[]), который меняет знак элемента массива array
// на противоположный, если значение этого элемента чётное.
//        int[] array = {1, -2, -3, 4, 5};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0){
//                array[i] = -array[i];
//            }
//
//        }
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);


//4. Реализовать метод main(String[]),
// в котором нужно скопировать содержимое массивов firstArray и secondArray
// в один массив resultArray.
//Массив firstArray должен быть в начале нового массива resultArray,
// а secondArray — после него.
//Программа должна правильно обрабатывать массивы любой длины.
//        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] secondArray = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        int[] resultArray = new int[20];
//
//        for (int i = 0; i < firstArray.length; i++) {
//            resultArray[i] = firstArray[i];
//            for (int j = 0; j < secondArray.length; j++) {
//                resultArray[10 + j] = secondArray[j];
//            }
//        }
//        System.out.println(Arrays.toString(resultArray));


//5.Тебе нужно написать программу, которая:
// 1. Считывает с консоли целое число N.
// 2. Если считанное число N больше 0, то программа дальше считывает целые числа,
// количество которых равно N.
// 3. Вывести в консоль считанные числа, если N нечетное - в порядке ввода,
// иначе — в обратном порядке.
// Каждое число выводить с новой строки. Число N выводить не нужно.
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        if (N > 0){
//            int[] array = new int[N];
//            for (int i = 0; i < N; i++) {
//                array[i] = scanner.nextInt();
//            }
//            if (N % 2 == 1)
//            for (int i = 0; i < N; i++) {
//                System.out.println(array[i]);
//            }
//            else{
//                for (int j = N - 1; j >= 0; j--) {
//                    System.out.println(array[j]);
//                }
//            }
//        }


//6.В этой задаче тебе нужно:
// 1. Ввести с клавиатуры число N.
// 2. Считать N целых чисел и заполнить ими массив array.
// 3. Найти максимальное число среди элементов массива.
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int[] array = new int[N];
//        for (int i = 0; i < N; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < N; i++) {
//            if (array[i] > max)
//                max = array[i];
//        }
//        System.out.println(max);


//7. В этой задаче тебе нужно:
//1. Считать 6 строк и заполнить ими массив strings.
//2. Удалить повторяющиеся строки из массива strings,
// заменив их на null (null должны быть не строками "null").
//        Scanner scanner = new Scanner(System.in);
//        String[] strings = new String[6];
//        for (int i = 0; i < strings.length; i++) {
//            strings[i] = scanner.nextLine();
//        }
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i] != null)
//            for (int j = i + 1; j < strings.length; j++) {
//                if (strings[j] != null && strings[j].equals(strings[i]))
//                strings[j] = null;
//            }
//        }
//        for (int i = 0; i < strings.length; i++) {
//            System.out.print(strings[i] + ", ");
//            }
    }
}


