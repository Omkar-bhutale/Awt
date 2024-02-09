import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.*;
public class Frame2 {
    JFrame f ; 
    Frame2(){
        f = new JFrame();
        f.setTitle("Radio button pgm");
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.getContentPane().setBackground(Color.RED);
        JRadioButton mrb = new JRadioButton("1) Male");
        JRadioButton frb = new JRadioButton("2) femle");
        ButtonGroup bg = new ButtonGroup();
        
        bg.add(mrb);
        bg.add(frb);
        f.add(mrb);
        f.add(frb);
    }    
    public static void main(String[] args) {
        Frame2 f = new Frame2();
    }
}
