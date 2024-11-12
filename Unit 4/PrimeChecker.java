import java.util.Scanner;
import java.lang.Math;

public class PrimeChecker 
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number less than 2 billion ");
        int numEnter = input.nextInt();
        while(numEnter > 2000000000)
        {
            System.out.println("It is greater than 2 billion, write a number less");
            numEnter = input.nextInt();
        }

        boolean primeChecker = true;

        for(int numDivide = 2; numDivide <= Math.sqrt(numEnter); numDivide ++)
        {
            if(numEnter%numDivide == 0)
            {     
                primeChecker = false;
            }
               
        }

        if (primeChecker)
        {
            System.out.println(numEnter + " is a prime.");
        }
        else
        {
            System.out.println(numEnter + " is not a prime.");
        }

 
    }
}
