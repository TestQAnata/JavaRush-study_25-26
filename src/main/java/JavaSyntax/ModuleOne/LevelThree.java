package JavaSyntax.ModuleOne;

import java.util.Scanner;

import static java.lang.Math.*;

public class LevelThree {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {

//1.Ввести с клавиатуры температуру на улице.
// Если температура меньше 0, вывести надпись "на улице холодно",
// иначе - вывести надпись "на улице тепло".
//        Scanner scanner = new Scanner(System.in);
//        int temp = scanner.nextInt();
//        if (temp < 0)
//            System.out.println("На улице холодно");
//        else
//            System.out.println("На улице тепло");

//2. Ввести с клавиатуры имя и возраст.
// Если возраст в пределах 18-28 (включительно),
// то вывести надпись "Имя, явитесь в военкомат",
// где Имя - это имя, введенное ранее с клавиатуры.
// Пример ввода: Amigo 18 Пример вывода: Amigo, явитесь в военкомат
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        String name = scanner.next();
//        if (age >= 18 && age <=28)
//            System.out.println(name + ", явитесь в военкомат");

//3. Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том,
// что температура тела высокая, низкая или нормальная, в зависимости от условий.
//В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая),
// в которые нужно вынести соответствующие условия и вместо выражений сравнения использовать эти переменные.
//        private static boolean isHigh;
//        private static boolean isLow; //добавить после класса(public class)

//        Scanner scanner = new Scanner(System.in);
//        double temp = scanner.nextDouble();
//        if (temp < 36) {
//            System.out.println("Температура тела низкая");
//        }
//        else if (temp > 37){
//            System.out.println("Температура тела высокая");
//        }
//        else
//            System.out.println("Температура тела нормальная");


//4. Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
// Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//        if (x == y && y == z){
//            System.out.println(x + " " + y + " " + z);
//        } else if (y == z) {
//            System.out.println(y + " " + z);
//        } else if (x == z) {
//            System.out.println(x + " " + z);
//        } else if (x == y) {
//            System.out.println(x + " " + y);
//        }

//5.Напишем программу, которая будет считывать с клавиатуры возраст. Если возраст от 20 до 60 (включительно),
// то выводить ничего не нужно, иначе - вывести фразу "можно не работать".
// Сделать это можно (и нужно!) с помощью только одного оператора if без else.
// Подсказка : используй логический оператор "||"
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        if (age <= 20 || age >= 60)
//            System.out.println("можно не работать");


//6. Ввести с клавиатуры два целых числа, которые будут координатами точки
// (первое считанное число - это координата "x", а второе - координата "y").
// Известно, что точка не лежит на координатных осях OX и OY.
//Вывести на экран номер координатной четверти, в которой находится данная точка.
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        if (x > 0 && y > 0)
//            System.out.println("первая четверть");
//        else if (x < 0 && y > 0) {
//            System.out.println("вторая четверть");
//        }
//        else if (x < 0 && y < 0){
//            System.out.println("третья четверть");
//        }
//        else if (x > 0 && y < 0){
//            System.out.println("четвертая четверть");
//        }


//7. Напиши программу, которая считывает с клавиатуры два вещественных числа (double)
// и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.
//        Scanner scanner = new Scanner(System.in);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//
//        if ( Math.abs(a - b) < 0.000001 ) {
//            System.out.println("Числа равны");
//        } else
//            System.out.println("Числа не равны");

//8.Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
//        Scanner scanner = new Scanner(System.in);
//        String one = scanner.nextLine();
//        String two = scanner.nextLine();
//        System.out.println(one.equals(two));

//9. В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3
// (строку string1 нужно сравнить со строкой string2, строку string2 со строкой string3 и строку string1 со строкой string3)
// с выводом соответствующего сообщения после каждого сравнения: "ссылки на строки одинаковые" или "ссылки на строки разные".
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        //напишите тут ваш код
        System.out.println((string1.equals(string2)?same:different));
        System.out.println((string2.equals(string3)?same:different));
        System.out.println((string1.equals(string3)?same:different));
    }

}
