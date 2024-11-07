import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String imie = JOptionPane.showInputDialog("Podaj swoje imie");
        JOptionPane.showMessageDialog(null,imie);
        int wynik = JOptionPane.showConfirmDialog(null,"Czy twoim zdaniem życie ma sens");
        JOptionPane.showConfirmDialog(null,wynik);
    }
}