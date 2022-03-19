import java.util.Scanner;

public class Calculator4
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter 2 Numbers:- ");
        float num1= input.nextFloat();
        float num2= input.nextFloat();

        System.out.println("1. Sum +");
        System.out.println("2. Subtract -");
        System.out.println("3. Multiply *");
        System.out.println("4. Devide");
        System.out.println("Enter Opperand to be Perfomed:-");
        int choice = input.nextInt();

        if(choice == 1)
        {
            float result = num1 + num2;
            System.out.println("Result= " + result);
        }
        if(choice == 2)
        {
            float result = num1 - num2;
            System.out.println("Result= " + result);
        }
        if(choice == 3)
        {
            float result = num1 * num2;
            System.out.println("Result= " + result);
        }
        if(choice == 4)
        {
            float result = num1 - num2;
            System.out.println("Result= " + result);
        }
    }    
}
