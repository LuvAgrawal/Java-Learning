import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number to find factorial of:- ");    
        Scanner input = new Scanner(System.in);

        int n= input.nextInt();
        int temp=1,i =1;

        for(i=1;i<=n;i++)
        {
            temp = i* temp;
        }
        
        // while(i<=n)
        // {
        //     temp = temp *i;
        //     i++;
        // }
        System.out.println("Factorial= " + temp);
    }    
}
