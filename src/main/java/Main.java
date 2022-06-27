import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * re-created by jjheffernan on 26 June 2022
 */
public class Main {

    public static void main(String[] args){
        int max = 50;
        int min = 0;
        System.out.println("Guess a number!"); // from Today's demo
        Scanner scan = new Scanner(System.in);
        int numInput = scan.nextInt();
        double computerGuess = Math.floor(Math.random()*(max-min+1)+min);

        while (computerGuess != numInput) {

            if (numInput>computerGuess){
                System.out.println("Guess was off by the high side, try again.");
                System.out.println("Guess a again!"); // from Today's demo
                numInput = scan.nextInt();
            }else if(numInput<computerGuess) {
                System.out.println("Guess was off by the low side, try again.");
                System.out.println("Guess a again!"); // from Today's demo
                numInput = scan.nextInt();
            } else {
                System.out.println("Winner winner chicken dinner!");
                break;
            }

        }

        System.out.println(numInput);

    }
}
