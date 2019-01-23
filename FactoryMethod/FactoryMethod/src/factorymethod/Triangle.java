package factorymethod;

import java.util.Scanner;

/*
    Concrete Product: implements the product interface
 */
public class Triangle implements Shape
{

    protected double height;
    protected double base;

    public Triangle()
    {
        height = 10;
        base = 10;
    }

    public Triangle(double h, double b)
    {
        height = h;
        base = b;
    }

    public void getInput()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the height of the triangle: ");
        height = keyboard.nextDouble();

        System.out.println("Please enter the base of the triangle: ");
        base = keyboard.nextDouble();
    }

    public void printArea()
    {
        double area = (height * base) / 2;

        area = Math.round(area * 100.0) / 100.0;

        System.out.println("Area of the triangle: " + area);
    }
}
