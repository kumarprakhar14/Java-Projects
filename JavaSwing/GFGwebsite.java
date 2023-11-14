import javax.swing.*;


public class GFGwebsite {
    public static void main(String[] args) {

        //creating instance of Jframe
       JFrame frame = new JFrame("GFG Website");
       //creating instance of Jbutton
       JButton button = new JButton("GFG Website click");
       button.setBounds(150, 200, 220, 50);
       //adding button in Jframe
       frame.add(button);
       frame.setSize(500, 600);
       frame.setLayout(null);  //using no layout managers
       frame.setVisible(true);   //making the frame visible
    }
}
