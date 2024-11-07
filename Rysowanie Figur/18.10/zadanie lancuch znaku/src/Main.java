import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String chain;
        char c;
        int chars = 0;
        System.out.println("Enter a chain of characters: ");
        chain = scanner.nextLine();
        System.out.println("Enter a character to search: ");
        c = scanner.nextLine().charAt(0);

        for(int i = 0; i < chain.length(); i++) {
            if(chain.charAt(i) == c) {
                chars++;
            }
        }

        System.out.println("The character " + c + " appears " + chars + " times in the chain.");
    }
}