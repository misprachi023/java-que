class EqualSumChecker {
    boolean hasEqualSum(int a, int b, int c) {
        if ((a + b) == c) {
            System.out.println("true");
            return true;

        } else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        EqualSumChecker obj = new EqualSumChecker();
        obj.hasEqualSum(1, 1, 1);
        obj.hasEqualSum(1, 1, 2);
        obj.hasEqualSum(1, -1, 0);
    }
}
