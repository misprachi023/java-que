import java.util.Scanner;
import java.util.Random;

class Hanggirl {

    private static String[] words = { "boy", "box", "dog", "parrot", "hand", "mouse", "screen", "pillow",
            "button", "chair", "monitor", "touch" };

    private static String word1 = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word1.length()]).replace("\0", "-");
    private static int count = 0;

    static StringBuilder missed;
    static StringBuilder guessWord;
    static StringBuilder guess;

    public Hanggirl() {
        guessWord = new StringBuilder(word1);
        try {
            for (int i = 0; i < word1.length(); i++) {
                guessWord.setCharAt(i, '-');
            }
        } catch (Exception e) {
        }
    }

    public static void clrscr() {
        // Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (Exception ex) {
        }
    }

    public static void main(String[] args) {
        // Hangman obj1=new Hangman();
        // obj1.printHangman(7);
        Scanner sc = new Scanner(System.in);

        while (count < 8 && asterisk.contains("-")) {
            System.out.println("Guess any letter in the word");
            // System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '-') {
                newasterisk += word1.charAt(i);
            } else {
                newasterisk += "-";
            }
        }

        if (asterisk.equals(newasterisk)) {
            count++;
            printHangman();
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word1)) {
            System.out.println("Correct! You win! The word was " + word1);
        }

    }

    public static void printHangman() {

        if (count == 1) {
            System.out.println("   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + "      |\n" + "   \t"
                    + "      |\n" + "   \t" + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n");
        }
        if (count == 2) {
            System.out.println("   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t"
                    + "      |\n" + "   \t" + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n");
        }
        if (count == 3) {
            System.out.println("   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t"
                    + " |    |\n" + "   \t" + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n");
        }
        if (count == 4) {
            System.out.println("   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t"
                    + "/|    |\n" + "   \t" + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n");
        }
        if (count == 5) {
            System.out.println("   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t"
                    + "/|\\   |\n" + "   \t" + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n");
        }
        if (count == 6) {
            System.out.println("   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t"
                    + "/|\\   |\n" + "   \t" + "/     |\n" + "   \t" + "      |\n" + "   \t" + "=======\n");
        }
        if (count == 7) {
            System.out.println("   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t"
                    + "/|\\   |\n" + "   \t" + "/ \\   |\n" + "   \t" + "Huff!!|\n" + "   \t" + "=======\n");
            System.out.println("GAME OVER! The word was " + word1);
        }
        // };
        // System.out.println(printHang[]);
        System.out.println("Word     :   " + asterisk);
        System.out.println("Misses   :   " + count);
        // System.out.println("Guess : "+guess);

    }

}