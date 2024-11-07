import javax.swing.*;
 class Cup {
    protected int cups;

    /**
     * Metoda pobierająca ilość kubków od użytkownika
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
     * Metoda wyswietlająca wyniki w oknie dialogowym JOptionPane
     * @return void
     * @param void
     */
    public void displayResults() {
        JOptionPane.showMessageDialog(null, "Kubki: " + cups + "\nLitry: " + cupToLiters(cups));
    }
}

public class Main {
    public static void main(String[] args) {
        Cup cup = new Cup();
        cup.getCups();
        cup.displayResults();
    }
}