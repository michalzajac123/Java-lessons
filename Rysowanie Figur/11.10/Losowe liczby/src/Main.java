import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int randomNumber(int range) {
        Random random = new Random();
        int randomInt = random.nextInt(range);
        return randomInt;
    }

    public static void main(String[] args){
        int guessNumber;
        int randomInt = randomNumber(100);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your number");
            guessNumber = scanner.nextInt();

            if(guessNumber > randomInt) System.out.println("Your number is too big");
            else if(guessNumber < randomInt) System.out.println("Your number is too low");
            else System.out.println("Congratulations you win. The number was: " + randomInt);

        }
        while(guessNumber != randomInt);
    }
}