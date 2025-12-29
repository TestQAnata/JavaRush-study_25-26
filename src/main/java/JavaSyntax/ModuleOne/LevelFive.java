package JavaSyntax.ModuleOne;

import java.util.Scanner;

public class LevelFive {
    public static void main(String[] args) {
//1. Используя цикл while вывести на экран сто раз цитату (переменная quote):
// «Я никогда не буду работать за копейки. Амиго» Каждое значение вывести с новой строки.
//        String quote = "Я никогда не буду работать за копейки. Амиго";
//        int b = 0;
//                while (b < 99) {
//                    System.out.println(quote);
//                    b++;
//                }

//2.Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
// пока пользователь не введет слово "ENTER". Вывести на экран полученную сумму и завершить программу.
//        Scanner console = new Scanner(System.in);
//        boolean isExit = false;
//        int sum = 0;
//        while (!isExit) {
//            if (console.hasNextInt()){
//                sum += console.nextInt();
//                console.nextLine();
//            } else {
//                isExit = console.nextLine().equals("ENTER");
//            }
//        }
//        System.out.println(sum);

//3.  Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник
// размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.
//        int n = 0;
//        while (n < 5){ int m = 0;
//            while (m < 10){
//                System.out.print("Q");
//                m++;
//            }
//            System.out.println("Q");
//            n++;
//        }

//4. Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник
// (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'. Незаполненная часть состоит из пробелов.
//       int a = 0;
//        while (a < 10){
//            int b = 0;
//            while(b < 20){
//                if(b == 0 || b == 20 || a == 0 || a == 9){
//                System.out.print("Б");}
//                else {
//                    System.out.print(" ");
//                }
//                b++;
//            }
//            System.out.println("Б");
//            a++;
//        }

//5.Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
// Для этого необходимо использовать бесконечный цикл (while(true)).
// Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            String a = scanner.nextLine();
//            if (a.equals("enough"))
//                break;
//        }

//6. Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3.
// Для этого используй цикл while.
// Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.
//        int s = 0;
//        while (s < 100) {
//            s++;
//            if((s % 3) == 0)
//                continue;
//            System.out.println(s);
//        }

//7. Программа должна считывать целые числа с клавиатуры до тех пор,
// пока не будет введено что-то другое: например, строка или символ.
// Выведи на экран минимальное число из введенных.
// Если введено несколько таких чисел, необходимо вывести любое из них.
// Пример ввода: 8 4 9 4 5 e Пример вывода: 4
//        Scanner console = new Scanner(System.in);
//        int min = Integer.MIN_VALUE;
//        while (console.hasNextInt()){
//            int q = console.nextInt();
//            if (q < min);
//            min = q;
//        }
//        System.out.println(min);

//8. Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
//Должно быть введено минимум два числа. Если введено меньше двух целых чисел,
// то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
//Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры.
// Если таких чисел несколько, то необходимо вывести любое из них.
//Минимальных чисел тоже может быть несколько.
//        Scanner console = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;// Начинаем с максимально возможного
//        int secondMin = Integer.MAX_VALUE;
//        int count = 0;
//        while (console.hasNextInt()) {
//            int num = console.nextInt();
//            count++;
//
//            if (num < min) {
//                secondMin = min;// Старый минимум становится вторым минимумом
//                min = num;// Текущее число становится новым минимумом
//            } else if (num > min && num < secondMin) {// Число больше минимума, но меньше текущего secondMin
//                secondMin = num;
//            }
//        }
//            if (count < 2) {
//                System.out.println("Ошибка: нужно ввести минимум два числа");
//                return;
//            }
//
//
//            if (secondMin == Integer.MAX_VALUE){
//                System.out.println("Все введённые числа одинаковые");
//            }
//            else {
//                System.out.println("Второе минимальное число: " + secondMin);
//            }

//9. Напиши программу, в которой с помощью цикла for на экран будут выведены
// чётные числа от 1 до 15. Каждое значение нужно выводить с новой строки.
//        for (int i = 1; i <= 15; i++) {
//            if (i % 2 == 0)
//            System.out.println(i);
//        }

//10. В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
// Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно),
// кратных multiple. Для этого используй цикл for.
// Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.
//        Scanner scanner = new Scanner(System.in);
//        int start = scanner.nextInt();
//        int end = scanner.nextInt();
//        int multiple = scanner.nextInt();
//
//        int sum = 0;
//        for (int i = start; i < end; i++) {
//            if (i % multiple != 0){
//                continue;
//            }
//            sum +=i;
//        }
//        System.out.println(sum);


//11. Давай используем цикл for, чтобы вывести на экран прямоугольный треугольник
// из восьмёрок со сторонами (катетами) 10 и 10.
// То есть в первой строке должна быть одна 8, начиная слева,
// во второй - две и т.д. Пример вывода на экран: 8
//        int tr = 10;
//        for (int i = 0; i < tr ; i++) {
//
//            for (int j = 0; j < tr - i - 1 ; j++) {
//                System.out.print("");
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                System.out.print("8");
//            }
//            System.out.println();
//        }

//12.В этой задаче нужно:
//Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
//Вывести на экран строку number раз с помощью цикла do-while.
// Каждое значение нужно вывести с новой строки.
//Если число number меньше/равно 0 или больше/равно 5,
// то введенную строку нужно вывести на экран один раз.
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        scanner.nextLine();
//        String string = scanner.nextLine();
//
//        int counter = 0;
//         do {
//             System.out.println(string);
//             counter++;
//
//        }
//         while (counter < number && number > 0 && number < 5);
//    }

    }
}