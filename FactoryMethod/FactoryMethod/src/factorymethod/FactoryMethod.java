package factorymethod;

import java.util.Scanner;

/*
    Payson Blackwell 1/21/19 CSD399

    Factory Method Definition: (Creational Pattern)
        Define an interface for creating an object, 
        but let subclasses decide which class to instantiate. 
        Factory Method lets a class defer instantiation to subclasses.
 */
public class FactoryMethod
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        ShapeCreator shapeCreator = new ShapeCreator();

        System.out.println("The program helps to find the area of the shape you want");

        System.out.println("Please enter 1 for circle, 2 for rectangle, or 3 for triangle.");
        int input = keyboard.nextInt();
        Shape s1 = shapeCreator.makeShape(input);

        s1.getInput();
        s1.printArea();

    }

}
