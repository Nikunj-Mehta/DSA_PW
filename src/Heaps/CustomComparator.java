package Heaps;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno;
    double perc;
    String name;
    Student(int rno, double perc, String name)
    {
        this.name = name;
        this.rno = rno;
        this.perc = perc;
    }
    public int compareTo(Student s)
    {
//        return this.rno - s.rno; // To sort on basis of roll no
//        return (int)(this.perc - s.perc); // To sort on basis of percentage
        return this.name.charAt(0) - s.name.charAt(0); // To sort on the basis of name
        // we can do sorting on the basis of 'nth' character of string.
    }
}

public class CustomComparator {
    public static void print(Student[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i].name + " " );
            System.out.print(arr[i].rno + " ");
            System.out.println(arr[i].perc + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];

        s[0] = new Student(78, 89.5, "Nikunj");
        s[1] = new Student(88, 79.8, "Om");
        s[2] = new Student(13, 95.1, "Jagrut");
        s[3] = new Student(83, 50.9, "Himanshu");
        print(s);
//        Arrays.sort(s);  this will not work as it does not know in what order it will sort thats why we use custom compator
        Arrays.sort(s);
        print(s);
    }
}
