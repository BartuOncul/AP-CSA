import java.util.Scanner;

public class MiddleCharacter 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string with odd length");
        String s1 = input.nextLine();

        while(s1.length()%2 == 0)
        {
            System.out.println("It should be with an odd legnth");
            s1 = input.nextLine();
        }
        String middleChar = s1.substring(s1.length()/2,s1.length()/2+1);
        System.out.println(middleChar);

    }
}
