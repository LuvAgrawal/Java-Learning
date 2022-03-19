import java.util.Scanner;

public class TempConversion 
{
    public static void main(String args[])        
    {
        // String choice;
        int choice;
        System.out.print("Do you want to convert °C into °F (Y/N):-");
        Scanner input= new Scanner(System.in);
        choice = input.nextInt();
        if (choice !=0)
        {
            System.out.print("Enter Temperature in °C:-");
            
            float temp=input.nextFloat();
            float cTof=((temp*9/5)+32);
            
            System.out.print("Temperature is " + cTof + "°F");
        }
    }
}
