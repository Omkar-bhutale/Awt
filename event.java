import java.awt.event.*;
import java.awt.*;
public class event extends Frame {
    
    event(){
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        
        Label l1 = new Label(" Enter 1st val");
        Label l2 = new Label(" Enter 2nd val");
        Label l3 = new Label("Result is Shown here");
        l3.setBackground(Color.GRAY);
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        Button b = new Button("Result");

        l1.setBounds(100,100,100,20);
        l2.setBounds(100,130,100,20);
        tf1.setBounds(220,100,100,20);
        tf2.setBounds(220,130,100,20);
        b.setBounds(140,160,100,20);
        l3.setBounds(140,190,100,30);
        add(l1);
        add(l2);
        add(l3);
        add(tf1);
        add(tf2);
        add(b);
    


        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                l3.setText(Integer.toString(a+b));

            }
        });

      
        // l1.setText(getName());
    }

    
    public static void main(String[] args) {
     new event();   
    }
      
}
