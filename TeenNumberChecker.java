class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        if (((a > 12) && (a < 20)) || ((b > 12) && (b < 20)) || ((c > 12) && (c < 20))) {
            System.out.println("true");
            return true;

        } else {
            System.out.println("false");
            return false;
        }

    }

    public static void main(String[] args) {
        TeenNumberChecker obj = new TeenNumberChecker();
        obj.hasTeen(9, 99, 19);
        obj.hasTeen(23, 15, 42);
        obj.hasTeen(22, 23, 34);

    }
}
