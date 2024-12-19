
public class sumOfEllements 
{
    private int[] values;
    
    public int arrayTaker()
    {
        int sum=0;
        
        System.out.println("Enter numbers");

        for(int i=0; i<values.length; i++)
        {
            sum+= values[i];
        }
        return sum;
    
    }
    public static void main(String[] args) 
    {
        sumOfEllements s1 = new sumOfEllements();

        s1.values = new int[] {10, 20, 30, 40, 50};
        System.out.println(s1.arrayTaker());

    }
}
    
    
