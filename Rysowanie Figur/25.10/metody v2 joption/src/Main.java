//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //ponizej znajduje sie komentarz javdoc, nalezy dokumetowac kod piszac komentarze javadoc
    //przed definicjami metod, nalezy umiescic krotkie objasnieie co dana metoda robi
    //Komentarz tego typu moga byc wczytywane i przetrwarzane za pomoca programu
    //javadoc, ktory generuje dokumentacje w formacie HTML
    /**
     * metoda deep wywoluje metode deepper i wyswietla komunikat
     */
    public static void deep() {
        System.out.println("Poczatek w metodzie deep");
        deepper();
        System.out.println("Koniec w metodzie deep");
    }
    /**
     * metoda deepper wyswietla komunikat
     */
    public static void deepper() {
        System.out.println("Jestem w metodzie deepper");
    }


    public static void main(String[] args) {
        System.out.println("Poczatek w metodzie main");
        deep();
        System.out.println("Koniec w metodzie main");
    }
}





