import java.util.Scanner;

public class numCounter 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter integers between 1 and 100");
        int[] numbers = new int[100];
        int num = input.nextInt();
        while (num != 0) { 
            if(num >= 1 && num <= 100) {
                numbers[num-1]++;
            }
            num = input.nextInt();
        }

        for(int i=0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.println((i+1) + " occurs "  + numbers[i] + (numbers[i] == 1 ? " time." : " times."));
            }
        }
    }
}
