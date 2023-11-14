package JavaSwing;
import javax.swing.*;

class LabelExample {
    public static void main(String[] args) {
        
    JFrame frame = new JFrame("Label Example");
    JLabel l1, l2;
    l1 = new JLabel("Label 1");
    l1.setBounds(50, 50, 100, 30);
    l2 = new JLabel("Label 2");
    l2.setBounds(50, 100, 100,30);
    frame.add(l1);
    frame.add(l2);
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true); 
    }
}
