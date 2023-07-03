import java.util.Scanner;

class Calculator {
    public double calculate(double a, double b, String operation) {
        double result = 0.0;

        switch (operation) {
            case "addition":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "multiplication":
                result = a * b;
                break;
            case "division":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();
        System.out.print("Enter the type of operation (addition, subtraction, multiplication, division): ");
        String operation = scanner.next();

        double result = calculator.calculate(a, b, operation);

        System.out.println("Result: " + result);
    }
}
