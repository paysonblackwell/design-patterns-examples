package factorymethod;

import java.util.Scanner;

/*
    Concrete Product: implements the product interface
 */
public class Rectangle implements Shape
{

    protected double length;
    protected double width;

    public Rectangle()
    {
        length = 10;
        width = 10;
    }

    public Rectangle(double l, double w)
    {
        length = l;

        width = w;
    }

    public void getInput()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the length of the rectangle: ");
        length = keyboard.nextDouble();

        System.out.println("Please enter the width of the rectangle: ");
        width = keyboard.nextDouble();
    }

    public void printArea()
    {
        double area = length * width;

        area = Math.round(area * 100.0) / 100.0;

        System.out.println("Area of the rectangle: " + area);
    }
}
