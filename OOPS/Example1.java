package OOPS;

class Student {
    String name;
    int age;

    public void getInfo(){
       System.out.println("The name of the student is " + this.name);
       System.out.println("The age of the student is " + this.age);
    }
}

public class Example1 {
    public static void main(String[] args) {
     Student s1 = new Student ();
     s1.name = "Aman";
     s1.age = 24;
     s1.getInfo();
     
     Student s2 = new Student();
     s2.name = "Shradha";
     s2.age = 22;
     s2.getInfo();
    }
}
