package OOPS;

class Calci
{
    public void add(int a, int b)
    {
        System.out.println("int-int argument");
    }

    public void add(float a, float b)
    {
        System.out.println("float-float argument");
    }

    public void add(double a, double b)
    {
        System.out.println("double-double argument");
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        Calci c = new Calci();
        c.add(10, 20); // what type of method to be called depends on type of arguments passed
        c.add(10.5f, 20.5f); // float-float
        c.add(10.5, 23.3); // double-double
    }
}
/* In case of method overloading compiler will bind the method call to the body of method.
   JVM should just execute the method body, so we say MethodOverloading as "Compile-Time-Binding"/ "EarlyBinding".
 */