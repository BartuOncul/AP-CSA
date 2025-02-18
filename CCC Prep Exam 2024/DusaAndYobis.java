import java.util.Scanner;

public class DusaAndYobis 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int dusaSize = input.nextInt();
        
        while (input.hasNextInt()) 
        {
            int ySize = input.nextInt();
            if (ySize < dusaSize) 
            {
                dusaSize += ySize;
            } 
            else 
            {
                break;
            }
        }
        
        System.out.println(dusaSize);
        input.close();
    }
}
