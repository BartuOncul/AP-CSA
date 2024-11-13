import java.util.Scanner;

public class CharacterCount 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase or a word that you want");
        String phrase = input.nextLine();

        

        System.out.println("Which character do you want to look.");
        String character = input.nextLine();
        int count = 0;

        for(int i=0; i< phrase.length(); i++)
        {
            if(phrase.substring(i,i+1).equals(character))
            {
                count++;
            }
        }
        System.out.println(count++);

    }
}
