import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int Sito(int n){
        boolean[] numbers = new boolean[n];
        Arrays.fill(numbers,true);
        int howManyPrimes=0;
        for(int i=2; i<n; i++){
            if(numbers[i]){
                howManyPrimes++;
                for(int j=i; j<n; j+=i){
                    numbers[j]=false;
                }
            }
        }
        return howManyPrimes;
    }

    public static void main(String[] args) {
        System.out.println(Sito(1000));
    }
}