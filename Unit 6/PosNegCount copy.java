import java.util.Scanner;

public class PosNegCount 
{
    public String counters()
    {
        Scanner input = new Scanner(System.in);

        int countNeg = 0;
        int countPos = 0;
        int countZero = 0;

        System.out.println("How many numbers do you want in your array?");
        int numArray = input.nextInt();

        int[] numbers = new int[numArray];

        for(int j=0; j<numbers.length; j++)
        {
            System.out.println("Enter your number " + (j+1));
            //numArray = input.nextInt();
            numbers[j] = input.nextInt();
        }

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]>0)
            {
                countPos++;
            }
            if(numbers[i]<0)
            {
                countNeg ++;
            }
            if(numbers[i]==0)
            {
                countZero++;
            }
        }
        
        return "there are " + countPos + " positive numbers. There are " + countNeg + " negative numbers. There are " + countZero + " zero numbers."; 
    }
    public static void main(String[]args)
    {
        PosNegCount count1 = new PosNegCount();
        System.out.println(count1.counters());
    }
    

}
