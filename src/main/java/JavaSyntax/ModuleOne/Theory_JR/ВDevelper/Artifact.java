package JavaSyntax.ModuleOne.Theory_JR.ВDevelper;

/* Музей древностей.
Твоя задача — спроектировать класс Artifact.

Артефакты, которые хранятся в музее, бывают трех видов.

Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).

Создай класс Artifact, описывающий хранящиеся в музее древности, и напиши необходимое количество конструкторов для него. В методе main() создай по одному артефакту каждого вида.*/

public class Artifact {

    int number;//порядковый номер
    String culture;//культура, может быть null
    int century;//век, может быть  если неизвестен

    public Artifact(int number){
        this.number = number;
    }

    public Artifact(int number, String culture){
        this.number = number;
        this.culture = culture;
    }

    public Artifact(int number, String culture, int century){
        this.number = number;
        this.culture = culture;
        this.century = century;
    }

    public static void main(String[] args) {

        Artifact papirus = new Artifact(23, "Ацтеки", 12);
        Artifact vaza = new Artifact(5678);
        Artifact calendar = new Artifact(73846, "Ацтеки");
    }
}
