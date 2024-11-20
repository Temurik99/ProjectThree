import java.util.Scanner;

public class HangManRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What word are you choosing?: ");
        String ans = scan.nextLine();
        HangManWord object = new HangManWord(ans);

        System.out.println(object.makeDashes());
        System.out.print("Guess a letter :");
        String letter = scan.nextLine();
        object.setGuess(letter);
        if (object.checkGuess()) {
            System.out.println("Your guess is in the word! printing output now...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 12; i++) {
                System.out.println();
            }

            while (object.getDashedLine().contains("___")) {/* add && and then about if the stick man gets filled */

            System.out.println(object.checkWord());
            System.out.println("Whats your next Guess?");
            ans = scan.nextLine();
            object.setGuess(ans);
            if (object.checkGuess()) {
                System.out.println("Your guess is in the word! printing output now...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for (int i = 0; i < 12; i++) {
                    System.out.println();
                }
                System.out.println(object.checkWord());

            } else {
                System.out.println("Your geuss is incorrect, do better....");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for (int i = 0; i < 12; i++) {
                    System.out.println();
                }
                System.out.println(object.checkWord());
                System.out.println("Whats your next Guess?");
            }

            }
        }

    }
}