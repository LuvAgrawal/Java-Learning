import java.util.Scanner;

public class USDtoINR6 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Rupees:- ");
        float rupee = input.nextFloat();
        float dollar = (float) (rupee * 0.013);
        
        System.out.println(rupee + "= " + dollar +" USD");
    }    
}
