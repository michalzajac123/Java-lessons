import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Wczytaj liczbe2");
        int liczba = odczyt.nextInt();
        switch (liczba){
            case 1 :
                System.out.println("Wybrales 1");
                break;
            case 2:
                System.out.println("Wybrales 2");
                break;
            case 3:
                System.out.println("Wybrales 3");
                break;
            default:
                System.out.println("Nie wybrales dobrej liczby");
        }
    }
}