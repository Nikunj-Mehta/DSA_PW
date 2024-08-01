package OOPS;

class Student {
    // Data Security
    private int rollNo;
    private String name;
    private String address;

    // setter methods
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    // getter methods
    public int getRollNo()
    {
        return rollNo;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Calling setter methods
        s1.setRollNo(7);
        s1.setName("Nikunj");
        s1.setAddress("Malhar Heights");

        // Calling getter methods
        System.out.println("Roll No is:"  + s1.getRollNo());
        System.out.println("Name is: "    + s1.getName());
        System.out.println("Address is: " + s1.getAddress());
    }
}
