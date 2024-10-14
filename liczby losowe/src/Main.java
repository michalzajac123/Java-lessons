import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //liczby losowe
        int number;
        Random random = new Random();
        number = random.nextInt(100);

        //Napisz program, który wylosuje liczbe losowa z zakraesu od 0 do 100
        //i zapyta uzytkownika o podanie liczby. Uzytkownik ma zgadywac jaka to liczba dopoki nie zgadnie. Pokazac probie powinen wypisac
        //czy liczba jest za duza czy za mala
        //Gdy uzytkownik zgadnie wypisac gratulacje
        //Oraz liczbe prob

        System.out.println("Zgadnij liczbe z zakresu od 0 do 100");

        int guess = -1;
        Scanner scanner = new Scanner(System.in);
        int iloscProb=0;
        while(guess!=number){
            System.out.println("Podaj liczbe: ");
            guess = scanner.nextInt();
            if(guess>number){
                System.out.println("Za duza liczba");
            }else if(guess<number){
                System.out.println("Za mala liczba");
            }
            iloscProb++;
        }
        System.out.println("Gratulacje! Zgadles liczbe w "+iloscProb+" probach");

    }
}