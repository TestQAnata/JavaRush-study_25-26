package org.example;

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
//        int i = 1;
//        while (i < 10) {
//            System.out.println("Итерация - " + i);
//            i++;
//        }
//
//        //Обратный счёт
//        int count = 5;
//                while(count >= 0){
//                    System.out.println("Осталось - " + count);
//                    count--;
//                }
//
//        //FORIT
//        //Прямой счёт
//        for (int j = 1; j < 10; j++) {
//            System.out.println("Итерация * " + j);
//        }
//
//        //Обратный счёт
//        for (int k = 5; k >= 1; k--) {
//            System.out.println("FOR * " + k);
//        }
//
//        //continue-1;
//        int w = 1;
//        while (w <= 20){
//            if ((w % 7) == 0) {
//                w++;
//                continue;
//            }
//            System.out.println(w);
//            w++;
//        }
//
//        //continue-2;
//        int q = 0;
//        while (q < 20){
//                 q++;
//                 if ((q % 7) == 0)
//                continue;
//            System.out.println(q);
//        }
//WHILE
//        //Подсчёт суммы чисел
//       //Создаем объект Scanner для чтения данных с консоли.
//        Scanner console = new Scanner(System.in);
//        //В переменной sum будем хранить сумму чисел.
//        int sum = 0;
//        //Пока в консоли вводят целые числа
//        while (console.hasNextInt())
//        {
//            //считываем очередное число в переменную x.
//            int x = console.nextInt();
//            //Добавляем x к сумме чисел (переменная sum).
//            sum = sum + x;
//        }
//        //Выводим подсчитанную сумму на экран.
//        System.out.println(sum);

        //Максимум введённых чисел
        Scanner console = new Scanner(System.in);
        int max = 0;
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            if (x > max)
                max = x;
        }
        System.out.println(max);
    }
}