package OOPS;

class Parent
{
    public void property()
    {
        System.out.println("Land + Cash + Gold");
    }

    public void marry()
    {
        System.out.println("Relative Girl");
    }
}

class Child extends Parent
{
    // Overriding
    public void marry()
    {
        // Re-Implementation
        System.out.println("Some other girl...");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        // Parent Object
        Parent P1 = new Parent(); // Runtime object i.e. new associated with which object
        P1.property(); // parent object
        P1.marry();

        System.out.println();

        // Child Object
        Child C1 = new Child();
        C1.property();
        C1.marry();

        // Child Object // Since it is overriding so it will be called with respect to object i.e. child
        Parent P2 = new Child(); // Child object can be reference in Parent type
        P2.property();
        P2.marry(); // jo reference object rhega uske basis pr he code run hoga isliyea some other girl output ayega
    }
}
/* Whenever Overriding happens method call will get executed not on the reference type,
 the method body will execute based on the runtime object */