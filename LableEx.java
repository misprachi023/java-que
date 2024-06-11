import java.awt.*;

class LabelEx {
    String msg = "---ANJALI MISHRA---";

    public LabelEx() {
        Frame F1 = new Frame("FRAME");
        F1.setLayout(new GridLayout(3, 3));
        F1.setSize(400, 500);

        Label L1 = new Label(msg + "1");
        F1.add(L1);
        Label L2 = new Label(msg + "2");
        F1.add(L2);
        Label L3 = new Label(msg + "3");
        F1.add(L3);
    }
}