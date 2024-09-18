package Strings;

public class EvenPositionToA {
    public static void main(String[] args) {
        String s = "Physics Wallah Skills";
        String t = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(i % 2 == 0) t += 'a';
            else t += s.charAt(i);
        }
        System.out.println(t);
        System.out.println(s);
        s = t;
        System.out.println(s);
    }
}
