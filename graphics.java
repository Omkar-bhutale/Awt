import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class graphics extends Frame {

    graphics(){

        setVisible(true);
        setLayout(null);
        setSize(700, 700);
        addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        g.setColor(Color.green);
        g.fillRect(100,100,100,100);
        g.setColor(Color.yellow);
        g.fillRect(200, 200, 100, 100);
        g.setColor(Color.red);
        g.drawString("Omkar Bhurale",50, 50);
        g.fillOval(300, 300, 100, 100);
    }
    public static void main(String[] args) {
        new graphics();
    }

}
