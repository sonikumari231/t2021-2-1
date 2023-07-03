import java.util.Scanner;

class NumberSeries {
    public static void generateSeries(int x) {
        int number = 1;
        for (int i = 1; i <= x; i++) {
            System.out.print(number + " ");
            number += 2;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (x): ");
        int x = scanner.nextInt();

        System.out.print("Output: ");
        generateSeries(x);
    }
}
