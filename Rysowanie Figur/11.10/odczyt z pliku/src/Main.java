import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static  void fileReader(String fileName) {
        File f = new File(fileName);
        Scanner inputFile = new Scanner(f);
        String line = inputFile.nextLine();
        System.out.println("Pierwszy wiersz to" + line);
        inputFile.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj nazwe pliku -> ");
        String fileName = sc.nextLine()+".txt";

        fileReader(fileName);
    }
}