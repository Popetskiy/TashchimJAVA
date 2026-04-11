//Музей древностей.
//Твоя задача — спроектировать класс Artifact.
//
//        Артефакты, которые хранятся в музее, бывают трех видов.
//
//Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
//Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
//Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).
//
//Создай класс Artifact, описывающий хранящиеся в музее древности, и напиши необходимое количество конструкторов для него. В методе main() создай по одному артефакту каждого вида.

public class Artifact {
    public static void main(String[] args) {
        Artifact art1 = new Artifact(2121421);
        Artifact art2 = new Artifact(212122, "Ацтеки");
        Artifact art3 = new Artifact(212123, "Ацтеки", 12);
    }
    int number;
    String cult;
    int century;

    public Artifact(int number){
        this.number = number;
    }
    public Artifact(int number, String cult) {
        this.number = number;
        this.cult = cult;
    }

    public Artifact(int number, String cult, int century) {
        this.number = number;
        this.cult = cult;
        this.century = century;
    }
}

