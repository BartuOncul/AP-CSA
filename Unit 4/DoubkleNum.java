import java.util.Scanner;

public class DoubleNum 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number");
        int numAsked = input.nextInt();

        if(numAsked > 100 || numAsked < -100)
        {
            System.out.println("The number was doubled 0 times.");
            
        }
        else
        {
            while(numAsked < 100 && numAsked > -100)
            {
                numAsked *= 2;
                System.out.println(numAsked);
                count++;
            }
            System.out.println("The number was doubled " + count + " times");
        }

        
    }
   
}
