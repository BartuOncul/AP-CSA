import java.util.Scanner;

public class SushiCost 
{

    
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many red plates you chose?");
        int numRed = input.nextInt();
        int point = 0;

        if(numRed>=0)
        {
            numRed *= 3;
            point += numRed;
        }

        System.out.println("How many green plates you chose?");
        int numGreen = input.nextInt();
        if(numGreen >=0)
        {
            numGreen *= 4;
            point += numGreen;
        }

        System.out.println("How many blue plates you chose?");
        int numBlue = input.nextInt();
        if(numBlue >=0)
        {
            numBlue *= 5;
            point += numBlue;
        }

        System.out.println(point);
        


    }
}

    
