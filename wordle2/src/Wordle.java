import java.util.Scanner;

public class Wordle {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final int WORD_LENGTH = 5;
    public static final int TURNS = 6;

    public static void main(String[] args) {
        Wordle W = new Wordle();
        W.playWordle();
    }

    public void playWordle() {
        Scanner input = new Scanner(System.in);
        String guess = input.nextLine().toUpperCase();
        String answer = "CHAOS".toUpperCase();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < guess.length(); i++) {
            char c = guess.charAt(i);
            if (answer.charAt(i) == c) {
                b.append(ANSI_GREEN).append(c).append(ANSI_RESET);
            } else if (answer.contains(Character.toString(c))) {
                b.append(ANSI_YELLOW).append(c).append(ANSI_RESET);
            } else {
                b.append(c);
            }
        }
        System.out.println(b.toString());
    }
}
