import java.lang.reflect.Method;

public class HangManDrawing {

    public String drawOne() {
        return "____\n" +
                "|/   |\n" +
                "|   \n" +
                "|    \n" +
                "|    \n" +
                "|    \n" +
                "|_____";
    }


    public String drawTwo() {
        return "____\n" +
                "|/   |\n" +
                "|   (_)\n" +
                "|    \n" +
                "|    \n" +
                "|    \n" +
                "|_____";
    }


    public String drawThree() {
        return " ____\n" +
                "|/   |\n" +
                "|   (_)\n" +
                "|    |\n" +
                "|    |    \n" +
                "|    \n" +
                "|_____";
    }


    public String drawFour() {
        return "____\n" +
                "|/   |\n" +
                "|   (_)\n" +
                "|   \\|\n" +
                "|    |\n" +
                "|    \n" +
                "|_____";
    }


    public String drawFive() {
        return " ____\n" +
                "|/   |\n" +
                "|   (_)\n" +
                "|   \\|/\n" +
                "|    |\n" +
                "|    \n" +
                "|_____";
    }


    public String drawSix() {
        return " ____\n" +
                "|/   |\n" +
                "|   (_)\n" +
                "|   \\|/\n" +
                "|    |\n" +
                "|   / \n" +
                "|_____";
    }


    public String drawSeven() {
        return  " ____\n" +
                "|/   |\n" +
                "|   (_)\n" +
                "|   /|\\\n" +
                "|    |\n" +
                "|   | |\n" +
                "|\n" +
                "|_____";
    }

    public void drawPick(int step) {
        switch (step) {
            case 1 -> System.out.println(drawOne());
            case 2 -> System.out.println(drawTwo());
            case 3 -> System.out.println(drawThree());
            case 4 -> System.out.println(drawFour());
            case 5 -> System.out.println(drawFive());
            case 6 -> System.out.println(drawSix());
            case 7 -> System.out.println(drawSeven());
            default -> System.out.println("Invalid step number.");
        }
    }


}
