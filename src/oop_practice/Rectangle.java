package oop_practice;

public class Rectangle implements Shape{
    private double length;
    private double width;
    
   Rectangle(double l, double w){
       this.length=l;
       this.width=w;
   }
   public void Area(){
       System.out.println("The Area of Rectabgle is: "+ (length*width));
   }
   public void Parameters(){
        System.out.println("\n-----PARAMETERS-----");
        System.out.println("Length: "+this.length);
        System.out.println("Width: "+this.width);
    }
}
