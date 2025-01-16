import java.util.Scanner;

public class BubbleSort 
{

    public static void bubbleSort(double[] array) 
    {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false; 
            for (int j = 0; j < n - 1 - i; j++) 
            {
                if (array[j] > array[j + 1]) 
                {
                    
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i] = scanner.nextDouble();
        }

        bubbleSort(numbers);

        System.out.println("Sorted numbers:");
        for (double number : numbers) 
        {
            System.out.print(number + " ");
        }
    }
}
