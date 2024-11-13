import java.util.Scanner;

public class MissingEvens 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        for(int i = 1; i<sentence.length(); i+=2)
        {
            // if even indexes are missing, than there are only odd indexes are present.
            String a = sentence.substring(i,i+1);
            System.out.print(a);

        }

    }
}
