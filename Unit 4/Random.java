import java.util.Scanner;
import java.lang.Math;

public class RandomInt 
{
    public static void main(String[] args)
    {
        int num1 = (int)((Math.random()*10)+1);
        int num2 = (int)((Math.random()*10)+1);
        int num3 = (int)((Math.random()*10)+1);
        int num4 = (int)((Math.random()*10)+1);
        int num5 = (int)((Math.random()*10)+1);

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
        double average = (double)(num1 + num2 + num3+ num4 + num5)/5;
        System.out.println("The average is " + average);

    }
}
