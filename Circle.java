class Circle {
    double radius;

    Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class Cyclinder extends Circle {
    double height;

    Cyclinder(double height, double radius) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

class CyclinderMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cyclinder cyclinder = new Cyclinder(5.25, 7.55);
        System.out.println("cyclinder.radius= " + cyclinder.getRadius());
        System.out.println("cyclinder.area= " + cyclinder.getArea());
        System.out.println("cyclinder.height= " + cyclinder.getHeight());
        System.out.println("cyclinder.volume= " + cyclinder.getVolume());
    }
}