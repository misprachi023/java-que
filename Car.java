import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Car
        extends Applet
        implements ActionListener {
    int x, y, z;
    int t1, t2;
    Button b1, b2;
    String msg = "  ";

    void slep() {
        try {
            Thread.sleep(100);

        } catch (Expection ex) {

        }

    }

    public void init(){
         t1=0;
         t2=1;
         x=20;
         y=60;
         setLayout(new FlowLayout(FlowLayout.CENTER));
         Label 1=new Label("webeduclick");
         b1=new Button("Forword");
         add(b1);
         b2=new Button("Stop");
         add(b2);
         b1.addActionListener(this);
         b2.addActionListener(this);

     }

    public void start() {

    }

    public void actionPerformed(Action Event e){
         String s=e.getActionCommand();
         if(s.equals("Forward")){
             msg="Forword";
             repaint();
         }
         else if(s.equals("Stop")){
             msg=" ";
             repaint();
         }
     }

    public void paint(Graphics g) {
        setBackground(Color.b1ack);
        z = getWidth();
        Color c1 = new Color(20, 160, 200);
        Color c2 = new Color(200, 60, 200);
        g.setColor(c1);
        g.drawLine(0, y + 75, z, y + 75);
        g.setColor(Color.red);
        g.fillRoundRect(x, y + 20, 100, 40, 5, 5);
        g.fillArc(x + 90, y + 20, 20, 40, 270, 180);
        g.setColor(Color.BLUE);
        g.fillRoundRect(x + 10, y, 70, 25, 10, 10);
        g.setColor(Color.white);
        g.fillRect(x + 20, y + 5, 20, 25);
        g.fillRect(x + 50, y + 5, 20, 25);
        g.setColor(Color.black);
        g.fillRoundRect(x + 55, y + 10, 10, 20, 10, 10);
        g.fillOval(x + 10, y + 50, 25, 25);
        g.fillOval(x + 60, y + 50, 25, 25);
        g.setColor(Color.white);
        g.fillOval(x + 15, y + 55, 10, 10);
        g.fillOval(x + 65, y + 55, 10, 10);
        x = x + 10;
        slep();
        if (msg.equals("Forward")) {
            if (x + 120 < z) {
                x = x + 1;
                showStatus("PressForward for Starting Car");
                repaint();

            }
        }

    }

}