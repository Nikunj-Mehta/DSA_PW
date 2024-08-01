package OOPS;

interface ICalculator
{
    // public abstract
    void add(int a, int b);
    void sub(int a, int b);
}
interface IAdvancedCalculator
{
    // public abstract
    void mul(int a, int b);
    void div(int a, int b);
}
class CalculatorImpl implements ICalculator, IAdvancedCalculator
{
    // ICalculator
    public void add(int a, int b)
    {
        System.out.println("The sum is: "+ (a+b));
    }
    public void sub(int a, int b)
    {
        System.out.println("The diff is: "+ (a-b));
    }

    // IAdvancedCalculator
    public void mul(int a, int b)
    {
        System.out.println("The sum is: "+ (a*b));
    }
    public void div(int a, int b)
    {
        System.out.println("The div is: "+ (a/b));
    }
}
public class interfaces {
    public static void main(String[] args) {
        // loose coupling: Polymorphism
        ICalculator calculator = new CalculatorImpl();
        calculator.add(10, 20);
        calculator.sub(100, 40);

        IAdvancedCalculator advCalculator = new CalculatorImpl();
        advCalculator.mul(4, 5);
        advCalculator.div(40, 8);
    }
}
