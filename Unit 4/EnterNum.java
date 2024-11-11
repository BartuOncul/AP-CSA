import java.util.Scanner;
public class EnterNum 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        int count = 0;
        int sum = 0;
        while(num1>0)
        {
            if(num1%10>0)
            {
                System.out.println(num1%10);
                num1 = num1 / 10;                
            }

            count ++;
        }
        System.out.println("The int has " + count + " digits");
    }
}


