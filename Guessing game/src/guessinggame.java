import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
    public state void main(string[] args){
        Random ran= new random();
        int numberToguess = rand,nextint(10000)
        int numberOfTries = 0;
        scanner input = new Scanner(system.in)
        int guess;
        boolean win = false

        while (win == false) {
             system.out.println("guess a number between 1 and 10000")
             guess = input.nextInt()
             numberOftries++;

             if (guess == numberToguess) {

    }
             else if (guess < numberToguess) {
                 system.out.println("Your guess is too low");

        }
         else if (guess > numberToguess)(
                 System.outprintln("Your guess is to high");
        }
        System.out.println("You Win");
        System.out.println("The Number was" + numberToguess);
        System.out.println("It took you" +numberOfTries + "tries")
    }
}
