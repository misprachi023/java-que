import java.util.Scanner;

class Addition {
    int a, b;
    Scanner in = new Scanner(System.in);

    Addition() {
        a = 15;
        b=15;
    }

    Addition(int x, int y){

        a=x;
        b=y;
    }
    void setter(){

    a=in.nextInt();
    b=in.nextInt();
}

    System.out.println("a="+a);
    System.out.println("b="+b);
}}

class Abc {
    public static void main(String[] args) {
        Addition obj1 = new Addition();
        Addition obj2 = new Addition(15, 15);
        obj1.getter();
        obj2.getter();

        obj1.setter();
        obj2.setter();

        obj1.getter();
        obj2.getter();
    }
}
