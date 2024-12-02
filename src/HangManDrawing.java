public class HangManDrawing {

    public String drawOne() {   //  I've drawn 8 different drawings to accommodate 8 different phases of the hangman
        return "____\n" +
                "|/   |               |----------------|\n" +
                "|                    | Enter The Word |\n" +
                "|                    |  if you think  |\n" +
                "|                    |  you know it!  |\n" +
                "|                    |----------------|\n" +
                "|_____";
    }

    public String drawTwo() {
        return "____\n" +
                "|/   |              |----------------|\n" +
                "|   (_)             | Enter The Word |\n" +
                "|                   |  if you think  |\n" +
                "|                   |  you know it!  |\n" +
                "|                   |----------------|\n" +
                "|_____";
    }

    public String drawThree() {
        return " ____\n" +
                "|/   |              |----------------|\n" +
                "|   (_)             | Enter The Word |\n" +
                "|    |              |  if you think  |\n" +
                "|    |              |  you know it!  |\n" +
                "|                   |----------------|\n" +
                "|_____";
    }

    public String drawFour() {
        return "____\n" +
                "|/   |              |----------------|\n" +
                "|   (_)             | Enter The Word |\n" +
                "|   \\|              |  if you think  |\n" +
                "|    |              |  you know it!  |\n" +
                "|                   |----------------|\n" +
                "|_____";
    }

    public String drawFive() {
        return " ____\n" +
                "|/   |              |----------------|\n" +
                "|   (_)             | Enter The Word |\n" +
                "|   \\|/             |  if you think  |\n" +
                "|    |              |  you know it!  |\n" +
                "|                   |----------------|\n" +
                "|_____";
    }

    public String drawSix() {
        return " ____\n" +
                "|/   |              |----------------|\n" +
                "|   (_)             | Enter The Word |\n" +
                "|   \\|/             |  if you think  |\n" +
                "|    |              |  you know it!  |\n" +
                "|   /               |----------------|\n" +
                "|_____";
    }

    public String drawSeven() {
        return  " ____\n" +
                "|/   |\n" +
                "|   (_)\n" +
                "|   /|\\\n" +
                "|    |\n" +
                "|   | |\n" +
                "|_____";
    }

    public String drawEight() {
        return  " ____\n" +
                "|/   |\n" +
                "|\n" +
                "|           (_)  [yay! Im free!!!]\n" +
                "|           \\|/\n" +
                "|            |\n" +
                "|_____      / \\";
    }

    public void drawPick(int step) {  // Method that uses the switch command to call the necessary method based on the parameter value, important for switching through the phases of the HangMan
        switch (step) {
            case 1 -> System.out.println(drawOne());
            case 2 -> System.out.println(drawTwo());
            case 3 -> System.out.println(drawThree());
            case 4 -> System.out.println(drawFour());
            case 5 -> System.out.println(drawFive());
            case 6 -> System.out.println(drawSix());
            case 7 -> System.out.println(drawSeven());
            case 8 -> System.out.println(drawEight());
            default -> System.out.println("Invalid step number.");
        }
    }
}
