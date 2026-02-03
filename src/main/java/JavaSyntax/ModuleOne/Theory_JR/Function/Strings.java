//package JavaSyntax.ModuleOne.Theory_JR.Function;
//
//import java.util.Scanner;
//
//public class Strings {
//    // Экранирование символов:
//    // \t	Вставить символ табуляции
//    // \b	Вставить символ возврата на один символ
//    // \n	Вставить символ новой строки
//    // \r	Вставить символ возврата каретки
//    // \f	Вставить символ прогона страницы
//    // \'	Вставить одинарную кавычку
//    // \"	Вставить двойную кавычку
//    // \\	Вставить обратный слеш
//
//    // Методы класса String
//    //int length() - Возвращает количество символов в строке
//    //boolean isEmpty() - Проверяет, что строка == пустая строка
//    //boolean isBlank() - Проверяет, что в строке — только whitespace-символы: пробел, tab, enter и т.п.
//    //char charAt(int index) - Возвращает символ, который стоит на index-позиции в строке.
//    //char[] toCharArray() - Возвращает массив символов (копию), из которых состоит строка
//    //byte[] getBytes() - Преобразует строку в набор байт и возвращает массив байт.
//    //String[] split(String regex) - Разделяет строку на несколько подстрок.
//    //String join(CharSequence delimiter, elements) - Склеивает вместе несколько подстрок
//    //String intern() - Помещает строку в пул StringPool.
//
////Сравнение строк
//    //boolean equals(String str) - Строки считаются равными, если все их символы совпадают.
//    //boolean equalsIgnoreCase(String str) - Сравнивает строки, игнорируя регистр (размер) букв.
//    //int compareTo(String str) - Сравнивает строки лексикографически. Возвращает 0, если строки равны.
//    //                      Число меньше нуля, если текущая строка меньше строки-параметра. Число больше нуля, если текущая строка больше строки-параметра
//    //int compareToIgnoreCase(String str) - Сравнивает строки лексикографически, игнорирует регистр. Возвращает 0, если строки равны. Число меньше нуля, если текущая строка меньше строки-параметра.
//    //                      Число больше нуля, если текущая строка больше строки-параметра
//    //boolean regionMatches(int toffset, String str, int offset, int len) - Сравнивает части строк
//    //boolean startsWith(String prefix) - Проверяет, что текущая строка начинается со строки prefix
//    //boolean endsWith(String suffix) - Проверяет, что текущая строка заканчивается на строку suffix
//
//
////Поиск подстрок
////int indexOf(String str) - Ищет строку str в текущей строке. Возвращает индекс первого символа встретившейся строки.
//    //int indexOf(String str, int index) - Ищет строку str в текущей строке, пропустив index первых символов. Возвращает индекс найденного вхождения.
//    //int lastIndexOf(String str) - Ищет строку str в текущей строке с конца. Возвращает индекс первого вхождения.
//    //int lastIndexOf(String str, int index) - Ищет строку str в текущей строке с конца, пропустив index первых символов.
//    //boolean matches(String regex) - Проверяет, что текущая строка совпадает с шаблоном, заданным регулярным выражением.
//
//    //Допустим, у нас есть url типа такого: «https://domen.com/about/reviews», и мы хотим заменить имя домена на javarush.com. Домены в урлах могут быть разными, но мы знаем, что:
//    //
//    //Перед именем домена идут два слеша //
//    //После имени домена идет одинарный слеш /
//    //Вот как бы выглядел код такой программы:
//
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);//Создание объекта Scanner
//        String path = console.nextLine();//Чтение строки с консоли
//
//        int index = path.indexOf("//");//Получаем индекс первого вхождения строки //
//        int index2 = path.indexOf("/", index + 2);//Получаем индекс первого вхождения строки /, но ищем только после символов //.
//
//        String first = path.substring(0, index + 2);//Получаем строку от начала и заканчивая символами //
//        String last = path.substring(index2);
//
//        String result = first + "javarush.com" + last;//Склеиваем строки и новый домен.
//        System.out.println(result);
//    }
//}
//Создание подстрок

//String substring(int beginIndex, int endIntex)//Возвращает подстроку, заданную интервалом символов beginIndex..endIndex.
//String repeat(int count)//Повторяет текущую строку count раз
//String replace(char oldChar, char newChar)//Возвращает новую строку: заменяет символ oldChar на символ newChar
//String replaceFirst(String regex, String replacement)//Заменяет в текущей строке подстроку, заданную регулярным выражением.
//String replaceAll(String regex, String replacement)//Заменяет в текущей строке все подстроки, совпадающие с регулярным выражением.
//String toLowerCase()//Преобразует строку к нижнему регистру
//String toUpperCase()//Преобразует строку к верхнему регистру
//String trim()//Удаляет все пробелы в начале и конце строки

