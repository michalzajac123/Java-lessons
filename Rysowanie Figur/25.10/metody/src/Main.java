import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void qualify() {
        JOptionPane.showMessageDialog(null, "Gratulacje! Kwalifikujesz się do otrzymania kredytu.");
    }
    public  static void noQualify() {
        JOptionPane.showMessageDialog(null, "Przykro mi, nie kwalifikujesz się do otrzymania kredytu.");
    }

    public static void main(String[] args) {
        double salary;
        int creditRating;
        String input;

        input = JOptionPane.showInputDialog("Jakie jest twoje roczne wynagrodzenie?");
        salary = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Jaki jest twoja ocena kredytowa\n" + "Wpisz cyfrę od 1 do 10 (10 = bardzo wysoka, 1 = bardzo niska): ");

        creditRating = Integer.parseInt(input);

        if (salary >= 20000 && creditRating >= 7) {
            qualify();
        } else {
            noQualify();
        }

        System.exit(0);
    }
}