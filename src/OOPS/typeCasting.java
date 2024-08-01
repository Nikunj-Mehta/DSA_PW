package OOPS;

class Casting
{
    public void add(int a)
    {
        System.out.println("int argument");
    }

    public void add(float a)
    {
        System.out.println("float argument");
    }
}
public class typeCasting {
    public static void main(String[] args) {
        Casting c = new Casting();
        c.add('a'); //char ---> char, int
        c.add(19L); // long ---> long, float, double
        // Compile time error no suitable method
        //c.add(10.5) // double ---> double
    }
}
