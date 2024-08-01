package OOPS;

class Calculator
{
    public void add(int a, int b)
    {
        int result = a + b;
        System.out.println("The sum is: "+ result);
    }
}
public class localVariable {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,48);
    }
}
