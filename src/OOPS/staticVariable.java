package OOPS;

class loan{
    // Static variable
    static float rateOfInterest = 9.5f;
}
public class staticVariable {
    public static void main(String[] args) {
        System.out.println(loan.rateOfInterest); // Static variable accessing using class name (better)
        System.out.println(new loan().rateOfInterest); // Static variable accessing using reference of object
    }
}
