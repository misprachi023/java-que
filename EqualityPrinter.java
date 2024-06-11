class EqualityPrinter {
    void printEquality(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c && c == a) {
            System.out.println("all numbers are equal");
        } else if (a != b && b != c && c != a) {
            System.out.println("all numbers are different");
        } else {
            System.out.println("neither all are equal or different");
        }
    }

    public static void main(String[] args) {
        EqualityPrinter obj = new EqualityPrinter();
        obj.printEquality(1, 1, 1);
        obj.printEquality(1, 1, 2);
        obj.printEquality(-1, -1, -1);
        obj.printEquality(1, 2, 3);
    }
}