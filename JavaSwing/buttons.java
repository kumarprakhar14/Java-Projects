import java.awt.*;

public class buttons {
    buttons(){
        Frame f = new Frame("buttons");
        Button b1 = new Button("OK");
        b1.setBounds(100, 50, 50, 50);
        f.add(b1);
        Button b2 = new Button("Sumbit");
        b2.setBounds(100, 100, 50, 50);
        f.add(b2);
        Button b3 = new Button("Cancel");
        b3.setBounds(100, 150, 80, 50);
        f.add(b3);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new buttons();
    }
}
