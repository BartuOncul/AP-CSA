import java.util.Scanner;
import java.lang.Math;

public class SecretNumber 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int computerNum = (int)(Math.random()*1001);
        int count = 0;
        System.out.print(computerNum);
        while(count<=50)
        {
            System.out.println();
            count++;
        }

        System.out.println("Now guess the number");
        int numTry = 0;
        int guessNum = input.nextInt();
        while(guessNum != computerNum)
        {
            if(guessNum < computerNum)
            {
                System.out.println("Guess a greater number");
                numTry++;
                guessNum = input.nextInt();

            }
            else  
            {
                System.out.println("Guess a smaller number");
                numTry++;
                guessNum = input.nextInt();
            }
        }
        System.out.println("Good job you dound the answer!");
        System.out.println("You tried " + numTry + " times.");
    }
}
