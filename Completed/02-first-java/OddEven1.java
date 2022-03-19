import java.util.Scanner;

public class OddEven1
{
    public static void main(String[] args)
    {
        System.out.print("Enter a Number:- ");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();

        if (num%2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}