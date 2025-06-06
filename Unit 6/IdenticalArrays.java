import java.util.Scanner;

public class IdenticalArrays 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter list1: ");
        int n1 = input.nextInt();
        int[] list1 = new int[n1];
        for (int i = 0; i < n1; i++) 
        {
            list1[i] = input.nextInt();
        }

        
        System.out.print("Enter list2: ");
        int n2 = input.nextInt();
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++) 
        {
            list2[i] = input.nextInt();
        }

        
        if (equals(list1, list2)) 
        {
            System.out.println("Two lists are identical");
        } 
        else
        {
            System.out.println("Two lists are not identical");
        }

        input.close();
    }

    public static boolean equals(int[] list1, int[] list2) {

        if (list1.length != list2.length) 
        {
            return false;
        }

        
        for (int i = 0; i < list1.length; i++) 
        {
            if (list1[i] != list2[i]) 
            {
                return false;
            }
        }

        return true;
    }
}
