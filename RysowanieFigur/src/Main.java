//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void drawZ(){
        for(int i=0 ;i<7; i++){
            for(int j=6; j>=0; j--){
                if(i==0 || i==6){
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
    public static void drawP(){
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                if(i==0 || i==3){
                    System.out.print("*");
                }
                else if(j==0){
                    System.out.print("*");
                }
                else if(j==6 && i<4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
   public static void drawM(){
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                if(j==0 || j==6){
                    System.out.print("*");
                }
                else if(i==j && j<4){
                    System.out.print("*");
                }
                else if(i+j==6 && j<4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void drawE(){
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                if(i==0 || i==3 || i==6){
                    System.out.print("*");
                }
                else if(j==0){
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
     drawM();
    }
}