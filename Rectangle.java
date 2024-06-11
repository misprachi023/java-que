class Rectangle {
    double width;
    double lenght;

    Rectangle(double width, double lenght) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (lenght < 0) {
            this.lenght = 0;
        } else {
            this.lenght = lenght;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getArea() {
        return width * lenght;
    }
}

class Cuboid extends Rectangle {
    double height;

    Cuboid(double width, double lenght, double height) {
        super(width, lenght);
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

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50, 10);

        System.out.println("rectangle width= " + rectangle.getWidth());
        System.out.println("rectangle lenght= " + rectangle.getLenght());
        System.out.println("rectangle area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid width= " + cuboid.getWidth());
        System.out.println("cuboid width= " + cuboid.getLenght());
        System.out.println("cuboid width= " + cuboid.getArea());
        System.out.println("cuboid width= " + cuboid.getHeight());
        System.out.println("cuboid width= " + cuboid.getVolume());

    }
}