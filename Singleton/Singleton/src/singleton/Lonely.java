package singleton;

public class Lonely
{

    private static Lonely instance = null;
    private int num;

    private Lonely()
    {
        System.out.println("A Lonely object has been made, too bad he is by himself");
        num = 0;
    }

    public static Lonely getInstance()
    {
        if (instance == null)
        {
            instance = new Lonely();
        }
        return instance;
    }

    public void setNum(int n)
    {
        num = n;
    }

    public int getNum()
    {
        return num;
    }
}
