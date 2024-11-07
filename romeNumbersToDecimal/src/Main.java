//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String zamienNaRzymska(int liczba) {
        String[] cyfryRzymskie = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] liczby = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i = 0;
        String liczbaRzymska = "";
        if (liczba > 3999) {
            return "Nie da się napisać liczby wiekszej od 3999";
        }
        while (liczba > 0) {
            if (liczba >= liczby[i]) {
                liczba -= liczby[i];
                liczbaRzymska += cyfryRzymskie[i];

            }
            if (liczba < liczby[i]) {
                i++;
            }
        }
        return liczbaRzymska;
    }

    public static void main(String[] args) {
        System.out.println("Liczba " + 532 + " Rzymsko to: " + zamienNaRzymska(542));


    }
}