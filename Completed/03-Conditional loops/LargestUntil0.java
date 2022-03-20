import java.util.Scanner;

public class LargestUntil0
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n,temp=0;
        
        do{
            System.out.print("Enter a number:-");
            n=input.nextInt();
            if(temp<n)
            {
                temp=n;
            }
        }while(n!=0);

        System.out.println("Largest Number= " + temp);
    }    
}
