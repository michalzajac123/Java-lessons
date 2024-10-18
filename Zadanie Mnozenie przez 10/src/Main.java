import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");

        int product=0 ;
        while(product<100){

            System.out.println("Podaj liczbe");
            int number=scanner.nextInt();
            product+=number*10;
        }
    }
}