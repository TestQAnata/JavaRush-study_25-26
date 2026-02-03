package JavaSyntax.ModuleOne.Theory_JR.Function;

import java.util.StringTokenizer;

public class StringsClass {
    //Класс StringTokenizer - разделяет строку на подстроки. Преимущества этого подхода в том, что он не разбивает сразу всю строку на кусочки, а потихоньку идет от начала к концу.
    // Методы: String nextToken() - Возвращает следующую подстроку
    //         boolean hasMoreTokens() - Проверяет, есть ли еще подстроки.
    //Создать объект StringTokenizer можно командой:
//    StringTokenizer имя = new StringTokenizer(строка, разделители);
    //Где строка — это строка, которую будем делить на части.
    // А разделители — это строка, каждый символ которой считается символом-разделителем.
    // Пример:
//    String str = "Good news everyone!";
//    StringTokenizer tokenizer = new StringTokenizer(str, "ne");
//    while (tokenizer.hasMoreTokens())
//    {
//        String token = tokenizer.nextToken();
//        System.out.println(token);
//    }

    //класс StringFormatter
    //У класса String есть статический метод format():
    // он позволяет задать шаблон объединения строки с данными.
    // Общий вид этой команды такой:
    //String имя = String.format(шаблон, параметры);
}
