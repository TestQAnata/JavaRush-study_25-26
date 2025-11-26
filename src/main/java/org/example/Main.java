package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //   while(true) {
        //       System.out.println("Цикл");
        //       break;
        //   }
        //Прямой счёт
////        int i = 1;
////        while (i < 10) {
////            System.out.println("Итерация - " + i);
////            i++;
////        }
////
////        //Обратный счёт
////        int count = 5;
////                while(count >= 0){
////                    System.out.println("Осталось - " + count);
////                    count--;
////                }
////
////        //FORIT
////        //Прямой счёт
////        for (int j = 1; j < 10; j++) {
////            System.out.println("Итерация * " + j);
////        }
////
////        //Обратный счёт
////        for (int k = 5; k >= 1; k--) {
////            System.out.println("FOR * " + k);
////        }
////
////        //continue-1;
////        int w = 1;
////        while (w <= 20){
////            if ((w % 7) == 0) {
////                w++;
////                continue;
////            }
////            System.out.println(w);
////            w++;
////        }
////
////        //continue-2;
////        int q = 0;
////        while (q < 20){
////                 q++;
////                 if ((q % 7) == 0)
////                continue;
////            System.out.println(q);
////        }
////WHILE
////        //Подсчёт суммы чисел
////       //Создаем объект Scanner для чтения данных с консоли.
////        Scanner console = new Scanner(System.in);
////        //В переменной sum будем хранить сумму чисел.
////        int sum = 0;
////        //Пока в консоли вводят целые числа
////        while (console.hasNextInt())
////        {
////            //считываем очередное число в переменную x.
////            int x = console.nextInt();
////            //Добавляем x к сумме чисел (переменная sum).
////            sum = sum + x;
////        }
////        //Выводим подсчитанную сумму на экран.
////        System.out.println(sum);
////
////        //Максимум введённых чисел
////        Scanner console = new Scanner(System.in);
////        int max = 0;
////        while (console.hasNextInt())
////        {
////            int x = console.nextInt();
////            if (x > max)
////                max = x;
////        }
////        System.out.println(max);
////    }
////}
//        //МАССИВЫ
//        //определить тип, символ массива [], название + количество элементов
//        int[] arr = new int[10];
//        System.out.println(Arrays.toString(arr));
//        boolean [] bool = new boolean[5];
//        System.out.println(Arrays.toString(bool));

        //создание с известным значением
//        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(Arrays.toString(arr2));
//        /*
//        [1, 2, 3, 4, 5, 6, 7, 8, 9]
//         0  1  2  3  4  5  6  7  8
//         */
//        int var = arr2[4];
//        System.out.println(var);
//        String [] arr3 = {"Monday", "Friday", "Wednesday"};
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(arr3.length);
//        System.out.println(arr3[3]); //ArrayIndexOutOfBoundsException: 3
//
//        String[]arr4 = {};
//        System.out.println(Arrays.toString(arr4));

//        int [] arr5 = new int[5];
//        System.out.println(Arrays.toString(arr5));
//        arr5[0] = 1;
//        arr5[1] = 1;
//        arr5[2] = 1;
//        arr5[3] = arr5[1] + arr5[2];
//        //            2   +   3
//        System.out.println(Arrays.toString(arr5));
//        //Ссылка
//        int[] origin = {1, 3, 6, 8, 90};
//        int[] copy = origin;
//        copy[2] = 9999;
//        System.out.println(Arrays.toString(origin));
//
//        //Копирование
//       int[] origin2 = {1, 3, 6, 8, 90};
//        int [] copyOf= Arrays.copyOf(origin2, origin2.length);
//        copyOf[2] = 9999;
//        System.out.println(Arrays.toString(origin2));
//        System.out.println(Arrays.toString(copyOf));

//        int [] copy = new int [origin2.length];
//        for (int i = 0; i < origin2.length; i++) {
//            copy[i] = origin2[i];
//            System.out.println(Arrays.toString(copy));
//        }
            //Иммутабельный (неизменяемый)
        int[] origin2 = {1, 3, 6, 8, 90, 99};
        for (int i = 0; i < origin2.length; i++) {
            System.out.println(origin2[i]);
        }
        int [] less = new int[origin2.length -1];
        for (int i = 0; i < origin2.length; i++) {
            if (i != 3) less [i] = origin2[i];
        }

        }
    }