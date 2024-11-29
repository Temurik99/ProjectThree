import javax.swing.*;
import java.util.Scanner;

public class HangManStructure {

    String word = "";

    public void start() {
        Scanner scan = new Scanner(System.in);

        setWord();

        HangManWord object = new HangManWord(word);
        HangManDrawing draw = new HangManDrawing();


        int incorrectGuesses = 0;
        final int maxIncorrectGuesses = 6;
        String wrongGuesses = "";

        draw.drawPick(1);
        System.out.println(object.makeDashes());

        while (incorrectGuesses < maxIncorrectGuesses  && object.getDashedLine().contains("___")) {

            System.out.print("Enter a guess: ");
            String guess = scan.nextLine();
            guess = guess.toLowerCase();

            animate();


            if (object.isWord(guess)) {
                draw.drawPick(8);
                System.out.println();
                System.out.println(object.checkWord(guess));
                break;
            } else if (object.checkGuess(guess)) {
                System.out.println("Correct guess!");
            } else {
                System.out.println("Wrong guess! Choose another letter");
                incorrectGuesses++;
            }

            if (incorrectGuesses < maxIncorrectGuesses) {
                draw.drawPick(incorrectGuesses + 1);
                System.out.println(object.checkWord(guess));
            }

            if (!object.checkGuess(guess)) {
                wrongGuesses += " " + guess;
                System.out.println("-------------");
                System.out.println("Wrong guesses:");
                System.out.println(wrongGuesses);
                System.out.println("-------------");
            } else {
                System.out.println("-------------");
                System.out.println("Wrong guesses:");
                System.out.println(wrongGuesses);
                System.out.println("-------------");
            }
        }

        if (incorrectGuesses == maxIncorrectGuesses) {
            animate();
            draw.drawPick(maxIncorrectGuesses + 1);
            System.out.println("Game over! The word was: " + word);
        } else {
            animate();
            draw.drawPick(8);
            System.out.println();
            System.out.println(object.checkWord(word));
            System.out.println("Congratulations! You guessed the word: " + word);
        }

    }

    public void setWord() {

        JPasswordField passwordField = new JPasswordField();
        Object[] options = {"OK"};
        int option = JOptionPane.showOptionDialog(
                null,
                passwordField,
                "Enter the word",
                JOptionPane.NO_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );

        if (option == 0) {
            word = new String(passwordField.getPassword());
        }

    }


    public void animate() {
        for (int i = 0; i < 12; i++) {
            System.out.println();
        }
    }



    /* bring down the correct or not correct to the new output/ add incorrect letters shown each time,
     add option to guess full word, if they think they got it, also if they get the letter correct,
     say there is/are x amount of the letter towards the end or at the front or in the middle of the word */

}
