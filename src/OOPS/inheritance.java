package OOPS;

class Person
{
    public String name;
    public String address;
    public int age;
}

class Students extends Person
{
    public int marks;
    public String grade;

    // Constructor
    Students(String name, String address, int age, int marks, String grade)
    {
        System.out.println("Called during object creation...");
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public void disp()
    {
        System.out.println("Name is: "+name);
        System.out.println("Address is: "+address);
        System.out.println("Age is: "+age);
        System.out.println("Marks is: "+marks);
        System.out.println("Grade is: "+grade);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Students student = new Students("sachin", "MI", 51, 100, "A");
        student.disp();

    }
}
