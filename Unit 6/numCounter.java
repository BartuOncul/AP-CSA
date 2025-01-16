import java.util.Scanner;
public class MyDeviation 
{
    private double[] tenNums;

    public void numCollector()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        tenNums = new double[10];
        for(int i =0; i<tenNums.length; i++)
        {
            tenNums[i] = input.nextDouble();
        }
    }

    public static double mean(double[] x)
    {
        double sum=0;

        for(int j=0; j<x.length; j++)
        {
            sum += x[j];
        }
        return (sum / x.length);
    }

    public static double deviation(double[] x)
    {
        double sum = 0;
        for(int j=0; j<x.length; j++)
        {
            sum+=x[j];
        }
        double mean = (sum / x.length);

        return (Math.sqrt(Math.pow(sum - mean, 2)) / (x.length-1));
    }
    
    public static void main(String[] args) 
    {
        MyDeviation myDev = new MyDeviation();
        myDev.numCollector();

        System.out.println("The mean is " + mean(myDev.tenNums));
        System.out.println("The standard deviation is " + deviation(myDev.tenNums));

    }
}
