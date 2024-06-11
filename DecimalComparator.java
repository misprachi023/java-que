class DecimalComparator {
    boolean areaEqualByThreeDecimalPlaces(double a, double b) {
        a = (int) (a * 1000);
        a = a / 1000;
        b = (int) (b * 1000);
        b = b / 1000;
        if (a == b) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;

        }
    }

    public static void main(String[] args) {
        DecimalComparator obj = new DecimalComparator();
        obj.areaEqualByThreeDecimalPlaces(-3.1756, -3.175);
        obj.areaEqualByThreeDecimalPlaces(3.175, 3.176);
        obj.areaEqualByThreeDecimalPlaces(3.0, 3.0);
        obj.areaEqualByThreeDecimalPlaces(-3.123, 3.123);
    }
}