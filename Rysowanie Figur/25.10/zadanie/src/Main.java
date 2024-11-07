import javax.swing.*;
public class Cup {
    protected int cups;

    /**
     * Metoda pobierająca ilość kubków
     * @return void
     * @param void
     */
    public void getCups() {
        String line;
        line = JOptionPane.showInputDialog("Podaj ilość kubków: ");
        cups = Integer.parseInt(line);
    }
    /**
     * Metoda konwertująca kubki na litry
     * @return double
     * @param int cups
     */
    public double cupToLiters(int cups) {
        return cups * 4;
    }

    /**
     * Metoda wyswietlająca wyniki
     * @return void
     * @param void
     */
    public void displayResults() {
        JOptionPane.showMessageDialog(null, "Kubki: " + cups + "\nUncje: " + cupToOunces(cups));
    }
}

public class Main {
    public static void main(String[] args) {
        Cup cup = new Cup();
        cup.getCups();
        cup.displayResults();
    }
}