package factorymethod;

import java.util.Scanner;
/*
    Concrete Product: implements the product interface
*/
public class Circle implements Shape
{
    protected double radius;
    
    public Circle()
    {
        radius = 10;
    }
    
    public Circle(double r)
    {
        radius = r;
    }
    
    
    public void getInput()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the radius of the circle: ");
        radius = keyboard.nextDouble();
    }
    
    public void printArea()
    {
        double area = Math.PI * radius * radius;
        
        area = Math.round(area*100.0) / 100.0;
        
        System.out.println("Area of the circle: "+ area);
    }
}
