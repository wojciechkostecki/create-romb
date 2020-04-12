import java.util.Scanner;

public class CreateRomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę, stanowiącą bok rombu: ");
        int diamondSide = scanner.nextInt();

        for (int i = 1; i <= diamondSide; i++) {
            for (int j = 1; j <= diamondSide - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= diamondSide; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
