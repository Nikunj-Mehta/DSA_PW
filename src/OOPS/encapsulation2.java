package OOPS;

class Employee{
    public String getEid;
    // Data Security
    private String eid;
    private String ename;
    private int    eage;
    private String eaddress;

    // Setter methods
    public void setEid(String eid)
    {
        this.eid = eid;
    }

    public void setEname(String ename)
    {
        this.ename = ename;
    }

    public void setEage(int eage)
    {
        this.eage = eage;
    }

    public void setEaddress(String eaddress)
    {
        this.eaddress = eaddress;
    }

    // Getter methods
    public String getEid()
    {
        return eid;
    }

    public String getEname()
    {
        return ename;
    }

    public int getEage()
    {
        return eage;
    }

    public String getEaddress()
    {
        return eaddress;
    }
}
public class encapsulation2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        // Calling setter methods
        e1.setEid("F382039L");
        e1.setEname("Nikunj Mehta");
        e1.setEage(20);
        e1.setEaddress("Malhar Heights");

        // Calling getter methods
        System.out.println("Employee id: "+ e1.getEid());
        System.out.println("Employee name: "+ e1.getEname());
        System.out.println("Employee age: "+ e1.getEage());
        System.out.println("Employee address: "+ e1.getEaddress());
    }

}
