package OOPS;

class Employe
{
    String name;
    int age;

    Employe()
    {
        System.out.println("Employee constructor called");
    }

    // instance method
    public void display()
    {
        System.out.println("Name is: "+ name);
        System.out.println("Age is: "+ age);
    }
}
public class constructor {
    public static void main(String[] args) {
        Employe emp = new Employe();
        emp.display();
    }
}
