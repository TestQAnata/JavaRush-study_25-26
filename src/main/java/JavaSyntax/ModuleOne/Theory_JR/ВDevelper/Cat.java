package JavaSyntax.ModuleOne.Theory_JR.ВDevelper;

public class Cat {

    String name;//поле класса
    int age;//поле класса

    static int count = 0;

    //конструктор для класса Cat
    //для домашних котов
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

//    для уличных котов
    public Cat(){
        count++;
        this.name = "Уличный кот номер " + count;

    }


//
//    public void sayMeow(){
//        System.out.println("Мяу!");
//    }
//
//    public void jump() {
//        System.out.println("Прыг-скок!");
//    }

    public static void main(String[] args) {
//        Cat barsik = new Cat("Barsik", 5);
        Cat streetCat1 = new Cat();
        Cat streetCat2 = new Cat();
        System.out.println(streetCat1.name);
        System.out.println(streetCat2.name);

//        Cat barsik = new Cat();
//        barsik.age = 3;
//        barsik.name = "Барсик";
//
//        barsik.sayMeow();
//        barsik.jump();
//        count++;
//
//        Cat vasia = new Cat();
//        vasia.age = 5;
//        vasia.name = "Вася";
//        count++;
//
//        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
//        System.out.println("Мы создали кота по имени " + vasia.name + ", его возраст - " + vasia.age);
//
//        System.out.println("Общее количество котов = " + count);
    }
}
