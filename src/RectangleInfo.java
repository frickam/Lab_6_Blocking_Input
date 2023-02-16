import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print("Enter the width of the rectangle in inches: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                if (width <= 0.0)
                {
                    System.out.println("You entered a negative value for width: " + width);
                    System.out.println("You must enter a positive value!");
                }
                else
                {}
            }

        }
        while(!done);
    }
}
