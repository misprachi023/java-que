import java.util.Scanner;

class stringLengthF {
    public static void main(String[] args) {
        int i = 0;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sc.nextLine();
        int n = str.length();
        System.out.println("Length of the string(using length() method=" + n);
        char ch[] = str.toCharArray();
        int n2 = ch.length;
        System.out.println("Length of the string(using length method=" + n2);
    }
}