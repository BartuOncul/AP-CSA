import java.util.Scanner;

public class StringWithExMark 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String");
        String st1 = input.nextLine();

        for(int i=0; i<5; i++)
        {
            st1 = st1 + "!";
            System.out.println(st1);
            
        }
        
    }
}
