import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String again = "t"; // sluzy do sterowania petla
        int die1, die2;

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        while(again.equalsIgnoreCase("t")) {
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;

            System.out.println("Wyrzuciles " + die1 + " i " + die2 + " = " + (die1 + die2));

            System.out.println("Czy chcesz rzucic jeszcze raz? (t/n)");
            again = input.nextLine();
        }
    }
}