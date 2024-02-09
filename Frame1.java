import java.awt.*;
class Frame1{
    public static void main(String[] args){
        Frame f1 = new Frame();
        f1.setTitle("Demo frame");
        f1.setSize(500, 500);
        f1.setLayout(new FlowLayout());
        Label l1 = new Label();
        l1.setText("Omkar");
        f1.add(l1);
        TextField tf1 = new TextField("Erase me and Enter text here");
        f1.add(tf1);
    }
}