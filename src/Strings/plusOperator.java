package Strings;

public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        s = s.concat("xyz"); // But this is useless as it cannot add no's directly
        String t = "pqr";
        s += t; // s = abcpqr
        s = 10 + s;
        System.out.println(s);
        System.out.println("Hi I am "+ 10 +"years old"); // + operator is better than concat

        System.out.println("abc"+10+20); // right to left evaluation to phale 10 string m add ho kr string bnega aur 20 bhi string
        System.out.println(10+20+"abc");// phale int addition phir string bnegi
        // String + integer or integet + String = String
    }
}
