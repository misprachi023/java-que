import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        String strOrig, strCopy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        strOrig = sc.nextLine();
        strCopy = strOrig;
        System.out.println("/nstrOrig= " + strOrig);
        System.out.println("strCopy= " + strCopy);

    }
}