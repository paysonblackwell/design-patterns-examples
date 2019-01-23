package factorymethod;
/*
    Creator: Declares the factory method, which returns an object of type Product. 
*/
public class ShapeCreator
{
    public Shape makeShape(int type)
    {
        if(type == 1)
        {
            return new Circle();
        }
        else if(type == 2)
        {
            return new Rectangle();
        }
        else if(type == 3)
        {
            return new Triangle();
        }
        else
        {
            return null;
        }
    }
}
