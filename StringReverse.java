import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String string = "MishraPrachi";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("/nString before reverse: " + string);
        System.out.println("String after reverse: " + reverse);
    }
}