import java.util.Scanner;

public class ProductSumInt 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int product=1,sum=0,difference;

        System.out.print("Enter a number:-");
        int n= input.nextInt();
        
        int i=n;
        //Sum
        while(i>0)
        {
            int temp= i%10;
            // System.out.println(temp);
            i= i/10;
            sum= temp+sum;
        }
        System.out.println("Sum= "+ sum);

        i=n;
        
        //Product
        while(i>0)
        {
            int temp=i%10;
            // System.out.println(temp);
            i= i/10;
            product= temp * product;
        }
        System.out.println("Product= "+ product);
        

    }
}