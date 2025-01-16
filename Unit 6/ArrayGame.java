import java.util.Scanner;
public class ArrayGame
{
    Scanner input = new Scanner(System.in);

    private int max =Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    private int total = 0;
    private int[] myArray = new int[6];

    public void arrayCreator()
    {
        
        System.out.println("Enter your numbers");
        

        for(int i=0; i<myArray.length; i++)
        {
            System.out.println("Enter your number " + (i+1));
            myArray[i] = input.nextInt();
        }
    }

    public int findMax()
    {
        for(int i=0; i<myArray.length; i++)
        {
            if(myArray[i]>max)
            {
                max = myArray[i];
            }
        }
        return max;
    }

    public int findMin()
    {
        for(int j=0; j< myArray.length; j++)
        {
            if(myArray[j]<min)
            {
                min = myArray[j];
            }
        }
        return min;
    }
    
    public int findTotal()
    {
        for(int a=0; a<myArray.length; a++)
        {
            total+=myArray[a];
        }
        return total;
    }
    


    public static void main(String[]args)
    {
        
        ArrayGame array1 = new ArrayGame();

        array1.arrayCreator();


        System.out.println("In your array max number is " + array1.findMax());
        System.out.println("In your array min number is " + array1.findMin());
        System.out.println("In your array the total number is " + array1.findTotal());
        
        array1.input.close();
    }
    
    

}
