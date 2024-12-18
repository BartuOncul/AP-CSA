public class ArrayWorker 
{
    private int[] values;

    public ArrayWorker(int[] values)
    {
        this.values = values;
    }
    public void doubleNums()
    {
        for(int i=0; i< values.length; i++)
        {
            values[i] *=2;
        }
    }
    public void tripleNums()
    {
        for(int i=0; i< values.length; i++)
        {
            values[i] *=3;
        }
    }
    public void printArray()
    {
        for(int i=0; i<values.length; i++)
        {
            System.out.println(values[i]);
        }
    }
    public static void main(String[] args) 
    {
        int[] numArray1 = {10, 18,92,96};
        int[] numArray2 = {18, 92, 96, 89};
    

        ArrayWorker worker1 = new ArrayWorker(numArray1);
        worker1.doubleNums();
        worker1.printArray();

        System.out.println();
        
        ArrayWorker worker2 = new ArrayWorker(numArray2);
        worker2.tripleNums();
        worker2.printArray();
        
    }
}
