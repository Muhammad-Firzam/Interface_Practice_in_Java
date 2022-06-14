package oop_practice;

public class OOP_PRACTICE {

    public static void main(String[] args) {
        System.out.println("\n\t\t---Circle---");
        Circle c1 = new Circle(2.0);
        c1.Area();
        Shape s1 = c1;
        s1.Area();
        s1.Parameters();
        
        System.out.println("\n\t\t---Rectanlge---");
        Rectangle r1 = new Rectangle(3,4);
        Shape s2 = r1;
        s2.Area();
        s2.Parameters();
    }
    
}
