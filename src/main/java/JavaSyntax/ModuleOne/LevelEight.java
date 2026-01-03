package JavaSyntax.ModuleOne;

public class LevelEight {
    public static void main(String[] args) {

        //1. Создай public static void printHydrogenInfo() метод, который должен выводить все строки о водороде.
        //Также создай public static void printJavaInfo() метод, который будет выводить все строки об острове Ява.
        //Наконец, в методе main() вызови эти два метода.
        //Общий вывод в консоли не должен измениться.
//        printHydrogenInfo();
//        printJavaInfo();
//
//        public static void printHydrogenInfo(){
//            System.out.println("Водород:");
//            System.out.println("Это химический элемент периодической системы с обозначением H и атомным номером 1.");
//            System.out.println("Является самым легким элементом таблицы.");
//            System.out.println("Водород применяется в:");
//            System.out.println("-Химической промышленности;");
//            System.out.println("-Нефтеперерабатывающей промышленности;");
//            System.out.println("-Авиации;");
//            System.out.println("-Электроэнергетике.");
//        }
//
//        public static void printJavaInfo(){
//            System.out.println("Остров Ява:");
//            System.out.println("Входит в состав Индонезии.");
//            System.out.println("На острове зародились государства Матарам, Маджапахит, Демак.");
//            System.out.println("Ява является самым населенным островом в мире:");
//            System.out.println("Общее население — 140 млн. человек.");
//            System.out.println("Плотность населения — 1061 чел/км.кв.");
//            System.out.println("Здесь производят один из знаменитых сортов кофе — Копи Лювак.");
//        }
//    }

//2. Перед тобой — плохой пример использования методов:
//
//Методы разделили двустишие;
//Одну строку кода не стоит оборачивать в отдельный метод.
//Перепиши код так, чтобы весь текст выводился в методе main, а остальные методы удали.
//Вывод программы не должен измениться.
//        public static void main(String[] args) {
//            System.out.println("Я — поэт, зовусь я Цветик.");
//            System.out.println("От меня вам всем приветик.");//напишите тут ваш код
//        }

//3.Переименуй параметры метода printPersonInfo():
//firstName в name;
//lastName в surname;
//favouriteDish в meal;
//таким образом, чтобы функционал программы остался неизменным.
//Имена переменных в методе main() оставь без изменений.

//public static void main(String[] args) {
//        String firstName = "Ольга";
//        String lastName = "Киприяновна";
//        String favouriteDish = "Пельмени";
//        printPersonInfo(firstName, lastName, favouriteDish);
//    }
//
//    public static void printPersonInfo(String name, String surname, String meal){
//        System.out.println("Краткое досье:");
//        System.out.println("Имя: " + name);
//        System.out.println("Фамилия: " + surname);
//        System.out.println("Любимое блюдо: " + meal);
//    }


//4. Метод createCrew() выводит должности и имена членов экипажа космического корабля.
//Во избежание путаницы внутри метода, измени имена параметров createCrew(), чтобы они соответствовали именам переменных, которые передаются в метод:
//name1 в navigator
//name2 в pilot
//name3 в secondPilot
//name4 в flightEngineer
//При этом результат выполнения программы не должен измениться.
//        public static void main(String[] args) {
//            String navigator = "Джон";
//            String pilot = "Пол";
//            String secondPilot = "Джордж";
//            String flightEngineer = "Ринго";
//            createCrew(navigator, pilot, secondPilot, flightEngineer);
//        }
//
//        public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
//            System.out.println("Четвёрка, которой предстоит покорить космос:");
//            System.out.println("Штурман: " + navigator);
//            System.out.println("Пилот: " + pilot);
//            System.out.println("Второй пилот: " + secondPilot);
//            System.out.println("Бортинженер: " + flightEngineer);
//        }

//5. Напишем утилиту для работы с массивами. Основная часть функционала готова: метод printArray() выводит в консоли все элементы массива.
//Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
//Метод должен работать только с массивами целочисленных значений (int[]).
        //public static void main(String[] args) {
        //        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        //        printArray(array);
        //        reverseArray(array);
        //        printArray(array);
        //    }
        //
        //    public static void reverseArray(int[] array) {
        //        int i = 0;
        //        for(i = 0; i < array.length / 2; i++){
        //            int temp = array[i];
        //            array[i] = array[array.length - 1 - i];
        //            array[array.length - 1 - i] = temp;
        //        }
        //        //напишите тут ваш код
        //    }
        //
        //    public static void printArray(int[] array) {
        //        for (int i : array) {
        //            System.out.print(i + ", ");
        //        }
        //        System.out.println();
        //    }

//6. Неплохо было бы иметь один метод для решения различных задач. У тебя есть возможность написать такой.
//Создай еще 9 методов universalMethod(). В сумме их должно получиться 10.
//Параметры, которые они должны принимать, придумай сам.
        // public static void main(String[] args) {
        //
        //    }
        //
        //    public static void universalMethod(){
        //
        //    }
        //
        //    public static void universalMethod(int x, int y){
        //
        //    }
        //    public static void universalMethod(double val){
        //
        //    }
        //    public static void universalMethod(int val){
        //
        //    }
        //    public static void universalMethod(String str, String str2){
        //
        //    }
        //    public static void universalMethod(String str){
        //
        //    }
        //    public static void universalMethod(int[][][] data, int value){
        //
        //    }
        //    public static void universalMethod(int[][] data, int value){
        //
        //    }
        //    public static void universalMethod(int[] data, int value){
        //
        //    }
        //    public static void universalMethod(String str, String str2, String str3){
        //
        //    }

    }
}
