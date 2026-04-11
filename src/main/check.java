import java.util.Scanner;

class Calculator {
    private final String operator;
    private final float a;
    private final float b;

    public float calculate() {
        return switch (operator) {
            case "+" -> sum(a, b);
            case "-" -> subtraction(a, b);
            case "*" -> multiplication(a, b);
            case "/" -> division(a, b);
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    Calculator(String operator, float a, float b) {
        this.operator = operator;
        this.a = a;
        this.b = b;
    }

    private int sum(int a, int b) {
        return a + b;
    }

    private double sum(double a, double b) {
        return a + b;
    }

    private float sum(float a, float b) {
        return a + b;
    }

    private int subtraction(int a, int b) {
        return a - b;
    }

    private double subtraction(double a, double b) {
        return a - b;
    }

    private float subtraction(float a, float b) {
        return a - b;
    }

    private int multiplication(int a, int b) {
        return a * b;
    }

    private double multiplication(double a, double b) {
        return a * b;
    }

    private float multiplication(float a, float b) {
        return a * b;
    }

    private double division(double a, double b) {
        return a / b;
    }

    private float division(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return a / b;
    }
}

class Scratch {
    private static final String FUCK_YOU = "\uD83D\uDD95";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();

        while (true) {
            try {
                String operation = getOperator();
                float a = getValue("A");
                float b = getValue("B");

                Calculator calc = new Calculator(operation, a, b);
                printResult(calc.calculate());
            } catch (Exception e) {
                break;
            }
        }
    }

    public static String getOperator() {
        boolean isCorrect = false;
        String operation = null;

        while (!isCorrect) {
            System.out.print("\n\nОперация: ");
            operation = scanner.next();

            if (operation.equalsIgnoreCase("q")) {
                throw new RuntimeException("By by");
            }

            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                System.out.println("\uD83D\uDD95 [" + operation + "] похож на что-то из (+, -, /, *)?");
                continue;
            }

            isCorrect = true;
        }

        return operation;
    }

    public static float getValue(String printValue) {
        float value = -1;
        boolean isCorrectB = false;
        String bStr = null;

        while (!isCorrectB) {
            try {
                System.out.printf("%s: ", printValue);
                bStr = scanner.next();
                if (bStr.equalsIgnoreCase("q")) {
                    throw new RuntimeException("By by");
                }

                value = Float.parseFloat(bStr);
                isCorrectB = true;
            } catch (NumberFormatException ignored) {
                printError(bStr);
            }
        }

        return value;
    }

    public static void printError(String value) {
        String msg = String.format("%s[%s] это по твоему число?", FUCK_YOU, value);
        System.out.println(msg);
    }

    private static void printResult(float result) {
        System.out.print("Результат: " + result);
    }
