package Lections;

public class Functions {
    static class Собака{
        //Поля класса
        String порода;
        String кличка;
        int возраст;

        //Методы класса
        public void скажиГав(int раз){
            for (int i = 0; i < раз; i++) {
                System.out.println(кличка + " говорит: ГАВ ГАВ");
            }
        }
        public void ктоТы(){
            System.out.println("Я" + кличка
            + " Мой возраст - " + возраст + " Моя порода - " + порода);
        }

        public void отметьДР() {
            System.out.println(кличка + " Мне сейчас - " + возраст + " Отмечаем ДР");
            возраст++;
            System.out.println(кличка + " Мне сейчас - " + возраст + " Закончили отмечать ДР");
        }

        public static void вилятьХвостом(){
            System.out.println(" Я виляю хвостом!!!");
        }
    }
}
