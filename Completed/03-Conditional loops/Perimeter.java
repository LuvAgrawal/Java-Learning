import java.util.Scanner;

public class Perimeter
{
    public static void main(String[] args)
    {
        int exit;
        do
        {
            System.out.println("a. Circle");
            System.out.println("b. Equilateral Triangle");
            System.out.println("c. Parallelogram");
            System.out.println("d. Rectatngle");
            System.out.println("e. Square");
            System.out.println("f. Rhombus");
            System.out.println("\nEnter Shape:- ");

            Scanner input = new Scanner(System.in);
            char choice= input.next().charAt(0);
            float answer;
        
            if (choice=='a' || choice=='A' )
            {
                //Perimeter of Circle
                System.out.print("Enter Radius of Circle:- ");
                int radius = input.nextInt();
                answer = 2*radius*3.14f;

                System.out.println("Perimeter= " + answer);
            }
            if (choice=='b' || choice== 'B')
            {
                //Perimeter of Triangle
                System.out.print("Enter Side: ");
                int side = input.nextInt();

                answer= (side)*3;
                System.out.println("Perimeter= " + answer);
            }
            if (choice == 'c' || choice == 'C')
            {
                //Perimeter of Parallelogram
                System.out.print("Enter Length: ");
                int length = input.nextInt();
                System.out.print("Enter Breadth: ");
                int breadth = input.nextInt();

                answer= 2*(length+breadth);
                System.out.println("Perimeter= " + answer);
            }
            if(choice=='D' || choice == 'd')
            {
                //Perimeter of Rectangle
                System.out.print("Enter Length: ");
                int length = input.nextInt();
                System.out.print("Enter Height: ");
                int breadth = input.nextInt();

                answer= (length+ breadth)*2;
                System.out.println("Perimeter= " + answer);
            }
            if(choice== 'E' || choice == 'e')
            {
                //Perimeter of Square
                System.out.print("Enter Side: ");
                int side = input.nextInt();

                answer= side*4;
                System.out.println("Perimeter= " + answer);
            }
            if (choice=='f' || choice== 'F')
            {
                //Perimeter of Rhombus
                System.out.print("Enter Diagonal: ");
                int side= input.nextInt();

                answer= side*4;
                System.out.println("Perimeter= " + answer);
            }
                      
            System.out.print("Continue (y/n):- ");
            int Continue= input.next().charAt(0);
            if(Continue=='Y' || Continue == 'y')
            {
                exit = 0;
            }
            else exit=1;
        }while(exit==0);
        // System.out.println("Perimeter= " + answer);
    }
}