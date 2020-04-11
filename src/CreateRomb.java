import java.util.Scanner;

public class CreateRomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę, stanowiącą bok rombu: ");
        int sideRomb = scanner.nextInt();

        for (int i = 1; i <= sideRomb; i++) {
            for (int j = 1; j <= sideRomb - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= sideRomb; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
