import java.util.Scanner;
import java.lang.Math;

public class AverageSpeed 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance in miles");
        int distance = input.nextInt();

        for(int avSpeed = 20; avSpeed<= 70; avSpeed+=10)
        {
            int hour = distance/avSpeed;
            int remainder = distance - (avSpeed*hour);
            int minutes = (60*remainder)/avSpeed;

            System.out.println("At " + avSpeed +"mph, it takes " + hour + " hours and " + minutes + " minutes.");
        }
    }
}
