import java.util.Scanner;

public class PensionCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int testCases = scanner.nextInt();
        
        for (int t = 0; t < testCases; t++) {
            System.out.println("Test Case " + (t + 1) + ":");
            System.out.print("Enter initial amount: ");
            double initialAmount = scanner.nextDouble();

            System.out.print("Enter yearly deduction: ");
            double yearlyDeduction = scanner.nextDouble();

            System.out.print("Enter annual interest rate (%): ");
            double interestRate = scanner.nextDouble();

            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            boolean isSustainable = willPensionLast(initialAmount, yearlyDeduction, interestRate, years);
            System.out.println(isSustainable ? "TRUE" : "FALSE");
        }

        
    }

    
    public static boolean willPensionLast(double initialAmount, double yearlyDeduction, double interestRate, int years) 
  {
        double balance = initialAmount;

        for (int i = 0; i < years; i++) 
        {

            balance -= yearlyDeduction;


            if (balance < 0) {
                return false;
            }

            balance += (balance * interestRate / 100);
        }

        return true;
    }
}
