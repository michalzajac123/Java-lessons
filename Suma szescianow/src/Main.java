//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void znajdzSzesciany(){
        for(int i=100; i<1000; i++){
            int cyfraJednosci=i%10;
            int cyfraDziesiatek=(i%100)/10;
            int cyfraStetek=i/100;
            int sumaSzescianow=(cyfraJednosci*cyfraJednosci*cyfraJednosci)+(cyfraDziesiatek*cyfraDziesiatek*cyfraDziesiatek)+(cyfraStetek*cyfraStetek*cyfraStetek);
            if(sumaSzescianow==i){

                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        znajdzSzesciany();
    }
}