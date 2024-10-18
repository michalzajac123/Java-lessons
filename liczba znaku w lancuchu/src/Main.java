import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jakis tekst !");
        String text = scanner.nextLine();

        System.out.println("Podaj znak, ktorego wystapienia chcesz policzyc w tekscie !");
        String Char = scanner.nextLine();

        int counter = 0; //Deklaracja zmiennej licznika wystapien znaku
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i) == Char.charAt(0)){ //Sprawdz czy znak w tekscie jest taki sam jak podany znak
               counter++; //Jesli tak to zwieksz licznik o 1
            }
        }
        System.out.println("Znak " + Char + " wystepuje " + counter + " razy w tekscie");
    }
}