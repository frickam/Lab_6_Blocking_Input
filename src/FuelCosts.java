import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double numGallons = 0.0;
        double fuelEfficiency = 0.0;
        double gasPrice = 0.0;
        double costPer100 = 0.0;
        double howFar = 0.0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print("Enter the number of gallons in the gas tank: ");
            if(in.hasNextDouble())
            {
                numGallons = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid Input! You said the number of gallons in the gas tank is: " + trash);
                System.out.println("Please enter a valid Input!");
            }
        }
        while(!done);
        done = false;
        do
        {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if(in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid Input! You said the number of gallons in the gas tank is: " + trash);
                System.out.println("Please enter a valid Input!");
            }
        }
        while(!done);
        done = false;
        do
        {
            System.out.print("Enter the price of gas per gallon: ");
            if(in.hasNextDouble())
            {
                gasPrice = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid Input! You said the price of gas per gallon is: " + trash);
                System.out.println("Please enter a valid Input!");
            }
        }
        while(!done);
        costPer100 = (100 / fuelEfficiency) * gasPrice;
        howFar = numGallons * fuelEfficiency;
        System.out.println("The cost per 100 miles for your vehicle is : $" + costPer100);
        System.out.println("Your vehicle can go " + howFar + " miles before running out of gas.");
    }
}
