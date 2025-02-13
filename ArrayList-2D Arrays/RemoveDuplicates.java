import java.util.ArrayList;

public class RemoveDuplicates 
{
    public static void main(String[] args)
    {
        ArrayList <Integer> myList = new ArrayList <>();
        for(int i=0; i<10; i++)
        {
            myList.add((int) Math.random()*100);
        }

        System.out.println("Generated List: " + myList);

        removeDuplicate(myList);
        System.out.println("List after removing duplicates: " + myList);
    }

    public static void removeDuplicate(ArrayList<Integer> list)
    {
        for(int i=0; i<list.size(); i++)
        {
            for(int j=i+1; j<list.size(); j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}
