import java.util.Scanner;

public class FubonacciSeries7
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Series Limit:- ");
        int n = input.nextInt();

        int num1=0,num2=1,numi;
        if(n == 0)
        {System.out.println("Fibobacci Series Sum = 0");}
        else
        {
            for (int i=2;i<=n;i++)
            {
                numi=num1+num2;
                num1=num2;
                num2=numi;
            }
            System.out.println("Fibonacci Series= "+ num2);
        }
    }
}