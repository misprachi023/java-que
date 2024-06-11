import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// we are going to create a HangMan Game 
public class HangManGame {
        public static String[] words = { "laptop", "mouse", "keyboard", "monitor", "touch", "prachi", "deepak",
                        "prakash" };
        String[] printHang = {
                        "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + "      |\n" + "   \t" + "      |\n"
                                        + "   \t"
                                        + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                        "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + "      |\n"
                                        + "   \t"
                                        + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                        "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + " |    |\n"
                                        + "   \t"
                                        + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                        "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + "/|    |\n"
                                        + "   \t"
                                        + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                        "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + "/|\\   |\n"
                                        + "   \t"
                                        + "      |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                        "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + "/|\\   |\n"
                                        + "   \t"
                                        + "/     |\n" + "   \t" + "      |\n" + "   \t" + "=======\n",
                        "   \t" + "-+----+\n" + "   \t" + " |    |\n" + "   \t" + " O    |\n" + "   \t" + "/|\\   |\n"
                                        + "   \t"
                                        + "/ \\   |\n" + "   \t" + "Huff!!|\n" + "   \t" + "=======\n",
        };

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String word=randomword();
        char[] placeholders=new char[word.lenght()];
        for(int i=0;i<placeholders.lenght;i++){
            placeholders[i]="-";
        }
        int misses=0;
        char[] missedGuesses=new char[7];
        while(misses<7){
            System.out.println(printpattern()[misses]);
            System.out.println("word");
            printPlaceholders(placeholders);
            System.out.println("\n");

        }
    }if(Arrays.equal(placeholders,word,))

        {

                System.out.println(printPattern[misses]);
                System.out.println(placeholders);
                System.out.println();
                break;
        }
}if
