import java.awt.*;

class Second extends Frame {
    String msg = "My Title";

    public Second() {
        Frame F = new Frame(msg);
        F.setLayout(null);
        F.setSize(400, 500);
        F.setVisible(true);

    }

    public static void main(String[] args) {
        new Second();
    }
}