import javax.swing.*;  // added tool for password protection (nobody sees the word)
import java.util.Scanner;

public class HangManStructure {

    String word = "";

    public void start() {
        Scanner scan = new Scanner(System.in);

        setWord();

        HangManWord object = new HangManWord(word); // creation of the two main classes needed to form the HangMan outputs
        HangManDrawing draw = new HangManDrawing();

        int incorrectGuesses = 0;
        final int maxIncorrectGuesses = 6;
        String wrongGuesses = "";

        draw.drawPick(1); //  uses my method in the drawing class that picks the drawing that needs to be used
        System.out.println(object.makeDashes());

        while (incorrectGuesses < maxIncorrectGuesses  && object.getDashedLine().contains("___")) { // runs the program whilst the word isn't solved or Hangman isn't fully drawn.

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

            if (!object.checkGuess(guess)) {     // Displays wrong guesses on each turn, used to keep track and not make wrong guess twice
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
            int random = (int) (Math.random() * 2) + 1;
            if (random == 1) {
                System.out.println("Congratulations! You guessed the word: " + word);
            } else {
                System.out.println("Wow great Job! You guessed the word: " + word);
            }
        }
    }

    public void setWord() {   // entire method used to create password protected entry

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

    public void animate() { // Creative way to animate the transitioning of frames into a new output
        for (int i = 0; i < 12; i++) {
            System.out.println();
        }
    }

    public void animate(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println();
        }
    }
}
