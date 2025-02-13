import java.util.*;

public class AddMultiply 
{
    public static void main(String[] args)
    {
        ArrayList <Integer> myList = new ArrayList<>();
        myList.add(11);
        myList.add(12);
        myList.add(0, 10);
        myList.add(23);
        myList.set(3, 13);

        int totalSum = 0;

        for(int i=0; i<myList.size(); i++)
        {
            System.out.println("The number is index " + i + " is: " + myList.get(i));
        }
        
        System.out.println();

        for(int i=0; i<myList.size(); i++)
        {
            totalSum += myList.get(i);
        }
        System.out.println("The total sum in my arrayList is " + totalSum);

        int totalProduct = 1;

        for(int i=0; i<myList.size(); i++)
        {
            totalProduct *= myList.get(i);
        }
        System.out.println("The total product in my arrayList is " + totalProduct);
    }
    
}
