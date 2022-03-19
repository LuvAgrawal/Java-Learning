import java.util.Scanner;

public class LargestNum5 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 2 Numbers:-");
        float a = input.nextFloat();
        float b = input.nextFloat();

        if (a>b)
        {
            System.out.println(a+ " is greater");
        }
        if(a<b)
        {
            System.out.println(b + " is greater");
        }
        if(a==b)
        {
            System.out.println( "Numbers are equal");
        }
    }    
}
