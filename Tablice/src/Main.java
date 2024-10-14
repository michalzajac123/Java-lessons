import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] imiona = new String[5];
        Scanner odczyt = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Wczytaj "+(i+1)+" imie");
            imiona[i] = odczyt.nextLine();
        }
        for(int i=0; i<5; i++){
            System.out.println("Witaj "+imiona[i]);
        }
    }
}