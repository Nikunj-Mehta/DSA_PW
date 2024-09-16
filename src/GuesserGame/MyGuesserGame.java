package GuesserGame;

import java.util.Scanner;

class Guesser{
    int GuesserNum; // Instance variable : class k andr method k bhar
    public int GuesserNumb()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser Kindly guess a number: ");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}

class Player{
    int PlayerNum; // Instance variable : class k andr method k bhar
    public int PlayerNumb()
    {
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}

class Umpire{
    int Guessernum;
    int Playernum1; // it is different see lower case.
    int Playernum2;
    int Playernum3;

    public void CollectNumFromGuesser()
    {
        Guesser Gu = new Guesser(); // Object of Guesser class
        Guessernum = Gu.GuesserNumb(); // Method calling by reference of object
    }

    public void CollectNumFromPlayer()
    {
        System.out.print("Player1 Kindly guess a number: ");
        Player P1 = new Player(); // Object of Player class
        Playernum1 = P1.PlayerNumb(); // Method calling by reference of object

        System.out.print("Player2 Kindly guess a number: ");
        Player P2 = new Player();
        Playernum2 = P2.PlayerNumb();

        System.out.print("Player3 Kindly guess a number: ");
        Player P3 = new Player();
        Playernum3 = P3.PlayerNumb();
    }

    public void Compare(){
        if(Guessernum == Playernum1)
        {
            if(Guessernum == Playernum2 && Guessernum == Playernum3)
            {
                System.out.println("All players WON the game...");
            }
            else if(Guessernum == Playernum2)
            {
                System.out.println("Player1 and Player2 WON the game...");
            }
            else if(Guessernum == Playernum3)
            {
                System.out.println("Player1 and Player3 WON the game...");
            }
            else System.out.println("Player 1 WON the game");
        }

        else if(Guessernum == Playernum2)
        {
            if(Guessernum == Playernum3)
                System.out.println("Player2 and Player 3 WON the game...");
            else
                System.out.println("Player2 WON the game...");
        }

        else if(Guessernum == Playernum3){
            System.out.println("Player3 WON the game...");
        }

        else
        {
            System.out.println("All players lost the game");
        }
    }
}


public class MyGuesserGame {
    public static void main(String[] args) {
        System.out.println("-------Game Started-------");
        Umpire um = new Umpire();
        um.CollectNumFromGuesser();
        um.CollectNumFromPlayer();
        um.Compare();
        System.out.println("-------Game Over-------");
    }
}
