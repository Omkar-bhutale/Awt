import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class TextAdd extends Frame{

        TextAdd(){
            setSize(500,500);
            setVisible(true);
            setLayout(new FlowLayout());

        }
        @Override
        public void paint(Graphics g) {
            Color c1 = new Color(100,150,200);
            g.setColor(c1);
            g.fillRect(200, 200, 100, 100);
            Font f = new Font("Hello ji", Font.BOLD+Font.ITALIC, 50);
            g.setColor(Color.red);
            g.drawString("Hello  ji omkar", 500, 500);
            
        }
        public static void main(String[] args) {
            TextAdd obj = new TextAdd();
        }
    
}
