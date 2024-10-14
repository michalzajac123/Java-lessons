import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] tablica;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilosc elementow");
        int n= scanner.nextInt();
        tablica = new int[n];
        for(int i=0; i<n; i++){
            tablica[i]=i+1;
        }
        int licznik=0;
        while(licznik<tablica.length){
            System.out.println(tablica[licznik]+" ");
            licznik++;
        }
    }
}