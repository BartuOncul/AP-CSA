import java.util.Scanner;
import java.lang.Math;

public class GuessNum 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int computerNum = (int)(Math.random()*31)+20;
        System.out.println("Guess the number, which is between [20-50]");
        int guessNum = input.nextInt();

        while(guessNum != computerNum)
        {
            if(guessNum>100)
            {
                System.out.println("You are giving up, the number was " + computerNum);
                break;
            }
            else if(Math.abs(guessNum - computerNum)<3)
            {
                System.out.println("You are so close");
                guessNum = input.nextInt();
            }
            else
            {
                System.out.println("It is too far from the number");
                guessNum = input.nextInt();
            }
        }
        if(guessNum == computerNum)
        {
            System.out.println("You found it!");
        }
        

    }

    
}
