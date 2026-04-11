//Сайт знакомств
//Вы создаете базу данных пользователей для сайта знакомств.
//
//Да вот беда — вы подзабыли в каком порядке их нужно указывать, а технического задания под рукой нет.
//
//Спроектируйте класс User,  у которого будут поля — имя (String) возраст (short) и рост (int).
//
//Создайте для него необходимое количество конструкторов, чтобы имя, возраст и рост можно было указывать в любом порядке.

public class User {
    public static void main(String[] args) {

    }

    String name;
    short age;
    int height;

    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;

    }

    public User(int height, String name, short age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public User(short age,int height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }
    public  User (String name, int height, short age){
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public  User (int height, short age ,String name){
        this.height = height;
        this.age = age;
        this.name = name;
    }
}


