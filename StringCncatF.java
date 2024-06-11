import java.util.Scanner;

class StringCncatF {
    public static void main(String[] args) {
        String str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string");
        str1 = sc.nextLine();
        System.out.println("Enter the 2nd string");
        str2 = sc.nextLine();
        System.out.println("Concatenated string is");
        System.out.println(str1.concat(str2));
    }
}