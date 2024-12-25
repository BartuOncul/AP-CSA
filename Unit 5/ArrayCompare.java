import java.util.Scanner;
public class ArrayCompare 
{
    Scanner input = new Scanner(System.in);
    
    
    private int[] myArray1;
    private int[] myArray2;
    

    public ArrayCompare()
    {
        System.out.println("What do you want for your array's size to be? ");
        int arrSize = input.nextInt();

        myArray1 = new int[arrSize];
        myArray2 = new int[arrSize];
    }
    
    public void firstArray()
    {
        for(int i=0; i<myArray1.length; i++)
        {
            System.out.println("You number " + (i+1) + " is " );
            myArray1[i] = input.nextInt();
            
        }
        
        
    }
    public void secondArray()
    {
        for(int i=0; i<myArray2.length; i++)
        {
            System.out.println("You number " + (i+1) + " is");
            myArray2[i] = input.nextInt();
        }
    }
    public String compareArrays()
    {
        int count = 0;
        for(int i=0; i<myArray1.length; i++)
        {
            if(myArray1[i] == myArray2[i])
            {
                count ++;
            }

        }
        if(count == myArray1.length)
        {
        
            return "The arrays are equal";
        }
        else
        {
            
            return "They are not equal. The arrays have equal " + count + " numbers.";
        }
    }

    public static void main(String[] args)
    {
        ArrayCompare compare1 = new ArrayCompare();
        
        compare1.firstArray();
        compare1.secondArray();

        System.out.println("Result: " + compare1.compareArrays());
        
    }

}
