import java.util.Scanner;

public class Factors
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number:- ");
        int n = input.nextInt();

        System.out.println("Factors: ");
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.print(i+ " ");
            }
        }
    }
}
