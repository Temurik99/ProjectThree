public class HangManWord {
    String word = "";
    String guess = "";
    String dashedLine = "";

    public HangManWord(String word) {
        this.word = word;
        this.guess = guess;
    }

    public String getWord() {
        return word;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public boolean checkGuess() {
        if (word.contains(guess)) {
            return true;
        } else {
            return false;
        }
    }

    public String makeDashes() {
        dashedLine = "";
        for (int i = 0; i < word.length(); i++) {
            dashedLine += " ___ ";
        }
        return dashedLine;
    }

    public String checkWord() {

        if (checkGuess()) {
            for (int i = 0; i < word.length(); i++) {
                String Sub = word.substring(i, i + 1);
                int j = i * 5;
                if(Sub.equals(guess)) {
                    dashedLine = dashedLine.substring(0, j + 2) + guess + dashedLine.substring(j + 3);
                }
            }
            return dashedLine;
        } else {
            return makeDashes();
        }
    }


}
