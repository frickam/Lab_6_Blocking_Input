import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double celsius = 0.0;
        double fahrenheit = 0.0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print("Enter the temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said the temperature in Celsius was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }
        while(!done);

        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature " + celsius + " degrees celsius is equal to " + fahrenheit + " degrees fahrenheit.");

    }
}
