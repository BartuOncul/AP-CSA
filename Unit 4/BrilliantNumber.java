import java.util.Scanner;
import java.lang.Math;

public class BrilliantNumbers 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number with no more than 10 digits");
        int num1 = input.nextInt();
        boolean isPrime = false;

        for(int i=2; i<= Math.sqrt(i) /2; i++)
        {
            if(num1 % i !=0)
            {
                isPrime = true;
            }
        }
        int numDivide1;
        int numDivide2;
        while(isPrime(numDivide1) && isPrime(numDivide2))
        {
            if(((""+numDivide1).length()== (""+numDivide2).length()))
            {
                if(num1 % numDivide1 ==0 && num1 % numDivide2 ==0) 
                {
                    System.out.println("it is Brilliant Number");
                }
            }
        }
    
        
    }
}
