import java.util.Scanner;
public class GameArray 
{
    private int max = Integer.MAX_VALUE;
    private int min = Integer.MIN_VALUE;
    private int total = 0;
    private int[] myArray = new int[6];

    Scanner input = new Scanner(System.in);

    public void arrayCreator()
    {
        System.out.println("Create your own array");
        for(int i=0; i<myArray.length; i++)
        {
            System.out.println("Etner your number " + (i+1));
            myArray[i] = input.nextInt();
        }
    }
    public int minFinder()
    {
        
        for(int i=0; i<myArray.length; i++)
        {
            if(myArray[i]<max)
            {
                max = myArray[i];
            }
        }
        return max;
    }
    public int maxFinder()
    {
        for(int i=0; i<myArray.length; i++)
        {
            if(myArray[i]>min)
            {
                min = myArray[i];
            }
        }
        return min;
    }
    public int totalFinder()
    {
        for(int i=0; i<myArray.length; i++)
        {
            total += myArray[i];
        }
        return total; 
    }

    public static void main(String[] args)
    {
        GameArray game1 = new GameArray();

        game1.arrayCreator();
        System.out.println("The minimum value in the array is " + game1.minFinder());

        System.out.println("The maximum value in the array is " + game1.maxFinder());

        System.out.println("The total numbers in the array is " + game1.totalFinder());
        game1.input.close();
    }

    
}
