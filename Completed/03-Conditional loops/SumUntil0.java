import java.util.Scanner;

public class SumUntil0 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n,temp=0;
        do
        {
            System.out.print("Enter a Number: ");
            n = input.nextInt();
            temp = temp + n;
        }while(n!=0);

        System.out.println("Sum of Entered Number= "+ temp);
    }
}
