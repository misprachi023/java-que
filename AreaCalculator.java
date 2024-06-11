class AreaCalculator {
    double area(double radius) {
        double x = radius * radius * Math.PI;
        if (radius < 0) {
            System.out.println("-1.0");

        } else {
            System.out.println("area of circle is " + x);
        }
        return x;
    }

    double area(double a, double b) {
        double y = a * b;
        if (a < 0 || b < 0) {
            System.out.println("-1.0");
        } else {
            System.out.println("area of rectangle is " + y);

        }
        return y;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        obj.area(0.5);
        obj.area(-1);
        obj.area(5.0, 4.0);
        obj.area(-1.0, 4.0);
    }
}