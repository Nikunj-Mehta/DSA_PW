package OOPS;

class teacher
{
    // instance variable
    String name;
    String subject;
    int age;

    // Parameterized constructor
    teacher(String name, String subject, int age)
    {
        this.name = name; // to refer to current object data always use "this" keyword
        this.subject = subject; // otherwise we will get output as default values
        this.age = age;
    }

    // instance method
    public void display()
    {
        System.out.println("Name is: "+ name);
        System.out.println("Subject is: "+ subject);
        System.out.println("Age is: "+ age);
    }
}
public class instanceVariable {
    public static void main(String[] args) {
        teacher t1 = new teacher("Pawar", "PPS", 40);
        t1.display();

        System.out.println();

        teacher t2 = new teacher("Bajare", "DSA", 43);
        t2.display();
    }
}
