import java.util.Scanner;

public class SecondE 
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String that has minimum 2 'e' letters");
        String s1 = input.nextLine();
        int count = 0;


        for(int i= 0; i< s1.length(); i++)
        {
            char letter = s1.charAt(i);
            if(s1.charAt(i)=='e' || s1.charAt(i)=='E')
            {
                count++;
            }
            
            if(count == 2)
            {
                
                System.out.println("The index of the second 'e' is: " + i);
                break;
            }

        }
        while(count < 2)
        {
            System.out.println("Min 2 'e' letters!");
            s1 = input.nextLine();
        }
        
    }
}
SecondE.java
