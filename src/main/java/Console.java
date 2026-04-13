import java.util.Scanner;


public class Console {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Введите первое число или 'q' для выхода");
            String check = scanner.next();
            if (check.equals("q")) {
                break;
            }
            float a = Float.parseFloat(check);

            System.out.println("Введите операцию (+, -, *, /) или 'q' для выхода");
            String aStr = scanner.next();
            if (aStr.equals("q")){
                return;
            }
            char operation = scanner.next().charAt(0);

            System.out.println("Введите второе число или 'q' для выхода");
            String bStr = scanner.next();
            if (bStr.equals("q")) {
                break;
            }
            float b = scanner.nextFloat();

            if (operation == '+') {
                float result = a + b;
                System.out.println(a + "+" + b + "=" + result);
            }
            else if (operation == '-') {
                float result = a - b;
                System.out.println(a + "-" + b + "=" + result);
            } else if (operation == '*') {
                float result = a * b;
                System.out.println(a + "*" + b + "=" + result);
            } else if (operation == '/') {
                if (b == 0) {
                    System.out.println("на ноль не делим");
                } else {
                    float result = a / b;
                    System.out.println(a + "/" + b + "=" + result);
                }
            } else {
                System.out.println("Ты чо, обезьяна. Калькулятором пользоваться не умеешь?");
            }
        }
    }
}