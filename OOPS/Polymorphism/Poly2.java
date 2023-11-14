package OOPS.Polymorphism;

//run time polymorphism
class Shape{
    public void area(){
        int b;
        int h;
        int r;
        System.out.println("displays area of dhape");
    }
}
class Triangle extends Shape{
    public void area(int h, int b){
        System.out.println((1/2)*b*h);
    }
}
class Circle extends Shape{
    public void area(int r){
      System.out.println(3.14*r*r);  
    }
}


public class Poly2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.b = 4;
        t1.h = 2;
        t1.area(t1.b, t1.h);

        Circle c1 = new Circle();
        c1.r = 3;
        c1.area(c1.r);
        
    }
}
