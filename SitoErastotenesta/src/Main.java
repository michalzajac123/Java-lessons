import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static int Euklides(int a,int b){
        while(a!=b){
            if(a>b){
                a-=b;
            }
            else{
                b-=a;
            }
        }
        return a;
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<=n-1; i++){
            for (int j=0; j<n-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static boolean isElementInArray(int[] array,int element){
        int n = array.length;
        int tempArray[] = new int[n+1];
        tempArray[n]=element;
        for(int i=0; i<n; i++){
            tempArray[i]=array[i];
        }
        for(int i=0; i<n; i++){
            if(tempArray[i]==element){
                System.out.println("Element is in array");
                if(i==n-1){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
    public static void drawZ(int a,int h){
        for(int i=h; i>=0; i--){
            for(int j=0; j<a; j++){
                if(i==0||i==h-1){
                    System.out.print("*");
                }
                else if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void drawU(int a,int h){
        System.out.println();
        for(int i=0; i<h; i++){
            for(int j=0; j<a; j++){
                if(j==0||j==a-1){
                    System.out.print("*");
                }
                else if(i==h-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(9));
        System.out.println(sito(15));
        System.out.println(Euklides(5, 2));
        int[] arr = {1, 5, 3, 2, 4};
        System.out.println(isElementInArray(arr, 1));
        drawZ(5, 5);
        drawU(7, 5);
    }
}