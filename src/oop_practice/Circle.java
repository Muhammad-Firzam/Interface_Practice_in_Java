package oop_practice;

public class Circle implements Shape{
    private double radius;
    
    Circle(double r){
        this.radius=r;
    }    
    public void Area(){
        System.out.println("The Area of Circle is: "+(radius)*pi*radius);
    }
    public void Parameters(){
        System.out.println("\n-----PARAMETERS-----");
        System.out.println("Radius: "+this.radius);
    }
}
