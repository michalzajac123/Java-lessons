import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class Pakiet{
        private String nazwaPakietu;
        private double kwotaRachunku;
        private double liczbaMinutRozmow;


        public void podajWartosci(){
            Scanner odczyt = new Scanner(System.in);
            System.out.println("Podaj nazwe pakietu");
            nazwaPakietu= odczyt.nextLine();
            System.out.println("Podaj liczbe minut rozmow");
            liczbaMinutRozmow=odczyt.nextDouble();
            switch (nazwaPakietu){
                case "A":{
                    if(liczbaMinutRozmow>450){
                        kwotaRachunku = 40 + 0.45*(liczbaMinutRozmow-450);
                    }
                }
                break;
                case "B":{
                    if(liczbaMinutRozmow>900){
                        kwotaRachunku = 59.99 + 0.4*(liczbaMinutRozmow-900);
                    }
                }
                break;
                case "C":{
                    kwotaRachunku=69.99;
                }
                default:{
                    System.out.println("Nie ma takiego pakietu");
                }
            }
        }
        public void wypiszWartoscRachunku(){
            System.out.println("Wartość rachunku to"+kwotaRachunku);
        }

    }
    public void main(String[] args) {
        Pakiet p = new Pakiet();
        p.podajWartosci();
        p.wypiszWartoscRachunku();
    }
}