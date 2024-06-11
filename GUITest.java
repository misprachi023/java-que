import java.awt.*;
import java.awt.event.*;

class GUITest implements MouseListener {
    Panel P1, P2, P3;
    Button b1, b2, b3, b4;
    TextField tf1, tf2;
    Label l1, l2, l3, l4;
    Frame f1;

    public GUITest() {
        f1 = new Frame();

        P1 = new Panel();
        P1.setLayout(new GridLayout(2, 2));

        P2 = new Panel();
        P2.setLayout(new BorderLayout());

        P3 = new Panel();
        P3.setLayout(new GridLayout(1, 4));

        f1.setLayout(new BorderLayout());
        f1.setSize(300, 200);
        f1.add(P1, BorderLayout.NORTH);
        f1.add(P2, BorderLayout.CENTER);
        f1.add(P3, BorderLayout.SOUTH);

        l1 = new Label("Enter the First Number :");
        P1.add(l1);

        tf1 = new TextField();
        P1.add(tf1);

        l2 = new Label("Enter the Second Number :");
        P1.add(l2);

        tf2 = new TextField();
        P1.add(tf2);

        Font font1 = new Font("Gilroy", Font.BOLD, 16);

        l3 = new Label("Result :", Label.LEFT);
        l3.setFont(font1);
        l3.setSize(50, 20);
        l3.setBackground(Color.green);
        l3.setForeground(Color.white);
        P2.add(l3, BorderLayout.WEST);

        l4 = new Label(" ", Label.LEFT);
        l4.setFont(font1);
        l4.setSize(50, 20);
        l4.setBackground(Color.blue);
        l4.setForeground(Color.black);
        l4.setSize(200, 100);
        P2.add(l4, BorderLayout.CENTER);

        b1 = new Button("+");
        b1.setFont(font1);
        b1.addMouseListener(this);
        P3.add(b1);

        b2 = new Button("-");
        b2.setFont(font1);
        b2.addMouseListener(this);
        P3.add(b2);

        b3 = new Button("*");
        b3.setFont(font1);
        b3.addMouseListener(this);
        P3.add(b3);

        b4 = new Button("/");
        b4.setFont(font1);
        b4.addMouseListener(this);
        P3.add(b4);

        f1.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
        // Tf1.setText("Entered");
    }

    public void mouseExited(MouseEvent e) {
        // Tf1.setText("Exit");
    }

    public void mousePressed(MouseEvent e) {
        Component c = e.getComponent();
        System.out.println(c);
        // System.out.println(c.getName());
        Integer a = Integer.parseInt(tf1.getText());
        Integer b = Integer.parseInt(tf2.getText());
        Integer result;
        if (c.getName().equals("button0"))
            result = a + b;
        else if (c.getName().equals("button1"))
            result = a - b;
        else if (c.getName().equals("button2"))
            result = a * b;
        else
            result = a / b;

        l4.setText(result.toString());
    }

    public void mouseReleased(MouseEvent e) {
    }

    public static void main(String[] args) {
        new GUITest();
    }
}
