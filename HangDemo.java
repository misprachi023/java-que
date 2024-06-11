import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class HangDemo {
    static StringBuilder word = new StringBuilder(selectARandomWord());
    StringBuilder guessWord;
    StringBuilder missed;
    StringBuilder guess;

    public HangDemo() {
        guessWord = new StringBuilder(word);
        try {
            for (int i = 0; i < word.length(); i++) {
                guessWord.setCharAt(i, '-');
            }
        } catch (Exception e) {
        }
    }

    public void clrscr() {
        // Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (Exception ex) {
        }
    }

    public static String selectARandomWord() {
        Random rand = new Random();
        String[] words = { "ant", "baboon", "badger", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck",
                "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey",
                "moose",
                "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat",
                "raven",
                "rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
                "tiger", "toad",
                "trout", "turkey", "laptop", "butter", "cat", "wolf", "prakash", "deepak" };
        return words[rand.nextInt(words.length)];
    }

    public void printHangman(int index) {
        clrscr();
       String [] printHang = {
                "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + "      |\n" + "   \t" + "      |\n" + "   \t"
                        + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + "      |\n" + "   \t"
                        + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + " |    |\n" + "   \t"
                        + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + "/|    |\n" + "   \t"
                        + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + "/|\\   |\n" + "   \t"
                        + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + "/|\\   |\n" + "   \t"
                        + "/     |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + "/|\\   |\n" + "   \t"
                        + "/ \\   |\n" + "   \t" + "Huff!!|\n" + "   \t" + "=======\n",
        };
        System.out.println(printHang[index]);
        System.out.println("Word     :   " + guessWord);
        System.out.println("Misses   :   ");
        System.out.println("Guess    :   ");

    }

    public static void main(String[] args) {
        HangDemo obj1 = new HangDemo();
        obj1.printHangman(6);
    }
}
