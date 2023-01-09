package FinalProjects;

import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess, random, right = 5, i = 0;
        boolean isWin = false;
        int[] wrongs = new int[right];

        Random rand = new Random();
        random = rand.nextInt(100);

        System.out.println("====ONUR GUESS====\nWelcome to our guessing game.\nInstructions: We picked a number between 0 and 99 randomly. You have "+right+" rights to guess.\n=====LET THE FUN BEGIN===");

        while (right > 0) {
            System.out.print("==========\nPlease enter a number: ");
            guess = input.nextInt();

            if (guess < 0 || guess > 99) {
                System.out.println("Wrong input. Your guesses should be between 0 and 99.");
                continue; //if this "if" scenario works; continue lets loop go first place without processing remaining codes.
            }

            if (guess == random) {
                System.out.println("Congratulations, you won!!");
                isWin = true;
                break;
            } else {
                right--;
                if (guess < random) {
                    System.out.println("You guessed less, it should be higher!");
                } else System.out.println("You guessed more, it should be lower!");

                wrongs[i++] = guess;
                System.out.println("Your remaining right is: " + right);

            }
        }
        if (!isWin) {
            System.out.println("The number was: " + random);
            System.out.println("Your attempt list is: " + Arrays.toString(wrongs));
        }
    }
}
