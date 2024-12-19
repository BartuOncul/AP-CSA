import java.util.Scanner;
public class MaxMinFinder 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to work with");
        int num = input.nextInt();
        int min = 9;
        int max=0;
        System.out.println("Enter numbers");

        int values[] = new int[num];

        for(int i=0; i<values.length; i++)
        {
            values[i] = input.nextInt();
        }

        for(int j=0; j<values.length; j++)
        {
            if(values[j]<min)
            {
                min = values[j];
            }
            
        }
        System.out.println("The smallest number is " + min);    
        
        for(int j=0; j<values.length; j++)
        {
            if(values[j]>max)
            {
                max = values[j];
            }
        }
        System.out.println("The greatest number is " + max);
        

    }
}
