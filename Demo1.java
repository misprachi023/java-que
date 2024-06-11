public class Demo1 {
    int x, y;

    public Demo1() {
        x = 14;
        y = 2;

    }

    public void show() {
        System.out.println(x / y);
    }

    public static void main(String[] args) {
        Demo1 obj1 = new Demo1();
        try {
            obj1.show();
        } catch (Exception e) {
            System.out.println("Cannot divide with zero");
        }
        System.out.println("End....");
    }

}