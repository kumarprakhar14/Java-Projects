import javax.swing.*;

public class actionListener2 {
    actionListener2(){
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon("registerbutton.jpg"));
        b.setBounds(0, 100, 300, 100);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new actionListener2();
    }
}
