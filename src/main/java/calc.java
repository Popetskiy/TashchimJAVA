import java.util.Scanner;

public class calc {

    public final String operator;
    public final float a;
    public final float b;

    calc(String operator, float a, float b) {
        this.operator = operator;
        this.a = a;
        this.b = b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;

    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public float subtraction(float a, float b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public float multiplication(float a, float b) {
        return a * b;
    }
    public int division(int a, int b) {
        if (b == 0) {
            System.out.println("на ноль не делипам");
        }
        return a / b;
    }
    public float division(float a, float b) {
        if (b == 0) {
            System.out.println("на ноль не делипам");
        }
        return a / b;
    }
    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("на ноль не делипам");
        }
        return a / b;
    }

    static class calculations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            printMenu();

            while (true) {
                System.out.println("Введите первое число: ");
                float a = scanner.nextFloat();

                System.out.println("Введите операцию: ");
                String operation = scanner.next();

                System.out.println("Введите второе: ");
                float b = scanner.nextFloat();
                calc calc = new calc(operation, a, b);

                if (operation.equals("+")){
                    System.out.println("Результат: " + calc.sum(a,b));
                } else if (operation.equals("-")){
                    System.out.println("Результат: " + calc.subtraction(a,b));
                } else if (operation.equals("*")){
                    System.out.println("Результат: " + calc.multiplication(a,b));
                } else if (operation.equals("/")){
                    System.out.println("Результат: " + calc.division(a,b));
                }
            }

        }

        private static void printMenu() {
            System.out.println("==========================================");
            System.out.println("          📟 КАРМАННЫЙ КАЛЬКУЛЯТОР        ");
            System.out.println("==========================================");
            System.out.println("  • OPERATION:  [ + ] [ - ] [ * ] [ / ]");
            System.out.println("  • EXIT:     Введите [ q ]");
            System.out.println("------------------------------------------");
            System.out.println("👉");
        }
    }


}

