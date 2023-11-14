package OOPS;

class Pen{
    String color;
    String type;   //ballpoint or gel

    public void penInfo() {
        System.out.println("The color of this pen is " + this.color);
        System.out.println("The type of this pen is " + this.type);
        System.out.println();
        
    }

}
public class Example2 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "ballpoint";

        p1.penInfo();
        p2.penInfo();
    }
}
