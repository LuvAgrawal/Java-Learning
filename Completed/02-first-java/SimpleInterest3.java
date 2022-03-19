import java.util.Scanner;

public class SimpleInterest3 
{
    public static void main(String[] args)    
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Ammount:- ");
        int principal= input.nextInt();
        
        System.out.print("Enter time (s):- ");
        int time = input.nextInt();

        System.out.print("Enter rate of interest:- ");
        float rate = input.nextFloat();

        float si= (principal*rate*time/100);
        System.out.println("Simple Interest = "+ si);
    }
}
