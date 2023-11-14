import java.awt.*;

public class language {
   language(){
    Frame f = new Frame("Languages");
    Label l1 = new Label("Select known language");
    l1.setBounds(100, 50, 120, 80);
    f.add(l1);
    Checkbox c1 =  new Checkbox("Hindi");
    c1.setBounds(100, 150, 50, 50);
    f.add(c1);
    Checkbox c2 = new Checkbox("English");
    c2.setBounds(100, 200, 80, 50);
    f.add(c2);
    Checkbox c3 = new Checkbox("Bhojpuri");
    c3.setBounds(100, 250, 80, 50);
    f.add(c3);
    f.setSize(500, 500);
    f.setLayout(null);
    f.setVisible(true);
   } 
   public static void main(String[] args) {
    new language();
   }
}
