package OOPS.Constructor;
    //non-parameterized constructor
    
    class Student {
        String name;
        int age;

        public void printInfo() {
            System.out.println("the name of the student is " + this.name);
            System.out.println("the age of the student is " + this.age);
            
        }
        
        Student(){
            System.out.println("constructor called");
        }
    }
public class Type1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shradha";
        s1.age = 22;

        s1.printInfo();
    }
}
