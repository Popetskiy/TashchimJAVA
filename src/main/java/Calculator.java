import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
    public final String operator;
    public final float a;
    public final float b;

    Calculator(String operator, float a, float b) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        while (true) {
            try {
                System.out.println("Введите первое число или \"q\" для выхода: ");
                String check = scanner.next();
                if (check.equals("q")) {
                    break;
                }
                float a = Float.parseFloat(check);

                System.out.println("Введите операцию (+, -, *, /) или \"q\" для выхода: ");
                String operator = scanner.next();
                if (operator.equals("q")) {
                    break;
                }


                System.out.println("Введите второе число или \"q\" для выхода: ");
                String q = scanner.next();
                if (q.equals("q")) {
                    break;
                }
                float b = Float.parseFloat(q);

                Calculator calc = new Calculator(operator, a, b);

                switch (operator) {
                    case "+":
                        System.out.println("Результат: " + calc.sum(a, b));
                        break;
                    case "-":
                        System.out.println("Результат: " + calc.subtraction(a, b));
                        break;
                    case "*":
                        System.out.println("Результат: " + calc.multiplication(a, b));
                        break;
                    case "/":
                        System.out.println("Результат: " + calc.division(a, b));
                        break;
                    default:
                        System.out.println("Ну ты совсем дурак?");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вводи нормально");
            } catch (Exception e) {
                System.out.println("Я еще держусь");
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
