public class BarkingDog {
    public static boolean ShouldWalkup(boolean barking, int hourOfDay) {
        System.out.println("The dog is barking at night!");
        {
            if (barking) {
                int time = 24;
            } else if (hourOfDay > 8 || hourOfDay < 22) {
                return true;
             {
                 else if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }
            return false;
        }

    }
}
