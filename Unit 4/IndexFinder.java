import java.util.Scanner;
public class IndexFinder 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence or a word");
        String sentence = input.nextLine();

        String a =sentence.substring(0,1);
        int index = -1;
        
        
        for(int j=sentence.length()-1; j>=0; j--)
        {
            String b = sentence.substring(j,j+1);

            if(a.equals(b) && j>0)
            {
                index = j;
                System.out.println(j);
                break;
            }
        }
        
        
    }
}
