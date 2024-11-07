import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        int product = 0;
        while(product < 100) {
            System.out.println("Podaj liczbę: ");
            liczba = scanner.nextInt();
            product += liczba*10;
        }
    }
}