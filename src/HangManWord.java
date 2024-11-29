public class HangManWord {
    String word = "";
    String dashedLine = "";

    public HangManWord(String word) {
        this.word = word;
    }

    public boolean checkGuess(String guess) {
        if (word.contains(guess) || word.contains(guess.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWord(String guessWord) {
        if (word.toLowerCase().equals(guessWord)) {
            return true;
        } else {
            return false;
        }
    }

    public String getDashedLine() {
        return dashedLine;
    }

    public String makeDashes() {
        dashedLine = "";
        for (int i = 0; i < word.length(); i++) {
            dashedLine += " ___ ";
        }
        System.out.println();
        return dashedLine;
    }

    public String checkWord(String guess) {

        if (isWord(guess)) {
            for (int i = 0; i < word.length(); i++) {
                String Sub = word.substring(i, i + 1);
                int j = i * 5;
                dashedLine = dashedLine.substring(0, j + 2) + Sub + dashedLine.substring(j + 3);

            }
            return dashedLine;
        }

        if (checkGuess(guess)) {
            for (int i = 0; i < word.length(); i++) {
                String Sub = word.substring(i, i + 1);
                int j = i * 5;
                if (Sub.equals(guess)) {
                    dashedLine = dashedLine.substring(0, j + 2) + guess + dashedLine.substring(j + 3);
                } else if (Sub.equals(guess.toUpperCase())) {
                    dashedLine = dashedLine.substring(0, j + 2) + guess.toUpperCase() + dashedLine.substring(j + 3);
                }
            }
            return dashedLine;

        } else {
            return dashedLine;
        }

    }
}





