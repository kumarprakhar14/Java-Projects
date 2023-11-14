package JavaSwing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jLabel {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("Kumar Prakhar");
        ImageIcon image = new ImageIcon("Jlabelimage.jpg");
        label.setIcon(image);



        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);

    }
}
