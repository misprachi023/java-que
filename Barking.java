import java.util.Scanner;

class Barking {
    public static boolean shouldwakeup(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {

        }
        if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(shouldwakeup(true, 1));
        System.out.println(shouldwakeup(false, 2));
        System.out.println(shouldwakeup(true, 8));
        System.out.println(shouldwakeup(true, -1));
    }
}
