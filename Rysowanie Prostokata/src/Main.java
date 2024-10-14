import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void rysujProstokat(int a,int b) {
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rysujTrojkatProstokatny(int h){
        for(int i=0; i<h; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rysujTrojkatRownoboczny(int h) {
        for (int i = 0; i < h; i++) {
                rysujSpacje(h-i-1);
                rysujGwiazdki(2*i+1);
                System.out.println();
        }
    }
    public static void rysujGwiazdki(int n){
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
    }
    public static void rysujSpacje(int n){
        for(int i=0; i<n; i++){
            System.out.print(" ");
        }
    }

    public static void main(String[] a5rgs) {
        Scanner odczyt = new Scanner(System.in);
        int a,b;
        System.out.println("Podaj a:");
        a=odczyt.nextInt();
        System.out.println("podaj b:");
        b=odczyt.nextInt();
        rysujProstokat(a,b);
        System.out.println();
        rysujTrojkatProstokatny(5);
        rysujTrojkatRownoboczny(5);
    }
}