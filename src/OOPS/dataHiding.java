package OOPS;

class Account{
    // Data Security
    private double balance;

    // methods :: public
    public void setBalance(double balance)
    {
        // Perform authentication
        boolean result = validate("sachin", "sachin123");

        if(result == true)
        {
            // Deposit the money
            this.balance = this.balance + balance;
            System.out.println("Credited "+balance+" to the account");
        }
        else
        {
            // Throw a meaningful message to the user
            System.out.println("Invalid username/password try again...");
        }
    }

    // method :: public
    public double getBalance(double balance)
    {
        // Perform authentication
        boolean result = validate("sachin", "sachin123");

        // Withdrawing the money
        if(result == true)
        {
            this.balance = this.balance - balance;
            return balance;
        }
        else
        {
            // Throw a meaningful message to the user
            System.out.println("Invalid username/password try again...");
            return 0.0f;
        }
    }

    // method :: private
    private boolean validate(String userName, String password)
    {
        // logic for authentication
        return userName.equalsIgnoreCase("sachin") && password.equals("sachin123");
    }
}

public class dataHiding {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(6000.0);

        double balance = acc.getBalance(500.0);
        System.out.println("Withdrawing: "+balance+" Amount");
    }
}