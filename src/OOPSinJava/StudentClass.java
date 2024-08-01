package OOPSinJava;

public class StudentClass {
    // User defined Date-Type
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Nikunj";
        x.rno = 68;
        x.percent = 92.5;
        System.out.println(x.name);
    }
}
