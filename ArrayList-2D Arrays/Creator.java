import java.util.ArrayList;

public class Creator 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();

        
        for(int i=0; i<5; i++)
        {
            arrayList.add((int) (Math.random() * Integer.MAX_VALUE) - Integer.MIN_VALUE / 2);
        }
        int toplam = 0;

        for(int i=0; i<arrayList.size(); i++)
        {
            toplam += arrayList.get(i);
        }
        System.out.println();
        System.out.println(toplam);

    }
}
