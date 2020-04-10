import java.util.Scanner;

public class CreateRomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę całkowitą: ");
        int userNumber = scanner.nextInt();
        int i, j;

        for (i = 1; i <= userNumber; i++) {
            for (j = 1; j <= userNumber - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= userNumber; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
