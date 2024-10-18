import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //symulacja rzutu kostka
        String again = "t"; //sluzy do sterowania petla
        int dice1,dice2; //przechowuja wynik rzutu kostka

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        while(again.equalsIgnoreCase("t")){
            dice1 = random.nextInt(6)+1;
            dice2 = random.nextInt(6)+1;
            System.out.println("Wyrzuciles " + dice1 + " i " + dice2);
            System.out.println("Chcesz rzucic jeszcze raz? (t/n)");
            again = scanner.next();
        }
    }
}