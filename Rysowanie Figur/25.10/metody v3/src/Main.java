//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Przekazywanie do metod");
        // Wywołanie metody displayValue z argumentem x na różne sposoby
        displayValue(x);
        displayValue(5);
        displayValue(x * 4);
        displayValue(x/3);
        displayValue(x - 5);

        showSum(5.2, 10.3);



    }

    /**
     * @param x 
     */
    public static void displayValue(int x) {
        System.out.println("Wartość to: " + x);
    }

    /**
     * Metoda przyjmująca dwa argumenty i wyświetlająca ich sumę
     * @param num1 - pierwszy argument
     * @param num2 - drugi argument
     */

    public static void showSum(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("Suma to: " + sum);

    }


    }
