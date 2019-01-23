package singleton;
/*
    Payson Blackwell 1/21/19 CSD399

    Singleton Definition: (Creational Pattern)
        Ensure a class only has one instance, 
        and provide a global point of access to it.
*/
public class Singleton
{
    public static void main(String[] args)
    {
        try
        {
            Lonely loneliest = new Lonely();    
        }catch(Exception e)
        {
            System.out.println("Can't initialize the Lonely object that way!");
        }
        
        Lonely loneliest = Lonely.getInstance();
        
        // Friend == same object as loneliest
        Lonely friend = Lonely.getInstance();
        
        System.out.println("Number stored in loner: "+loneliest.getNum());
        System.out.println("Number stored in friend: "+friend.getNum());
        
        //Changing any instance of Lonely changes all 
        friend.setNum(1);
           
        System.out.println("Number stored in loner: "+loneliest.getNum());
        System.out.println("Number stored in friend: "+friend.getNum());
        
        if(loneliest.getNum() == friend.getNum())
        {
            System.out.println("Loneliest's friend is himeself, and "+loneliest.getNum()+" is the Loneliest's number");
        }
        
        
    }
    
}
