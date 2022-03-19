import java.util.Scanner;

public class Area
{
    public static void main(String[] args)
    {
        int exit;
        do
        {
            System.out.println("a. Circle");
            System.out.println("b. Triangle");
            System.out.println("c. Rectangle");
            System.out.println("d. Isosceles Triangle");
            System.out.println("e. Parallelogram");
            System.out.println("f. Rhombus");
            System.out.println("g. Equilateral Triangle");
            System.out.println("\nEnter Shape:- ");

            Scanner input = new Scanner(System.in);
            char choice= input.next().charAt(0);
            float answer;
        
            if (choice=='a' || choice=='A' )
            {
                //Area of Circle
                System.out.print("Enter Radius of Circle:- ");
                int radius = input.nextInt();
                answer = radius*3.14f;

                System.out.println("Area= " + answer);
            }
            if (choice=='b' || choice== 'B')
            {
                //Area of Triangle
                System.out.print("Enter Length: ");
                int length = input.nextInt();
                System.out.print("Enter Height: ");
                int breadth = input.nextInt();

                answer= (length* breadth)/2;
                System.out.println("Area= " + answer);
            }
            if (choice == 'c' || choice == 'C')
            {
                //Area of Rectangle
                System.out.print("Enter Length: ");
                int length = input.nextInt();
                System.out.print("Enter Breadth: ");
                int breadth = input.nextInt();

                answer= length* breadth;
                System.out.println("Area= " + answer);
            }
            if(choice=='D' || choice == 'd')
            {
                //Area of Isosceoes Triangle
                System.out.print("Enter Length: ");
                int length = input.nextInt();
                System.out.print("Enter Height: ");
                int breadth = input.nextInt();

                answer= (length* breadth)/2;
                System.out.println("Area= " + answer);
            }
            if(choice== 'E' || choice == 'e')
            {
                //Area of Parellelogram
                System.out.print("Enter Length: ");
                int length = input.nextInt();
                System.out.print("Enter Breadth: ");
                int breadth = input.nextInt();

                answer= length* breadth;
                System.out.println("Area= " + answer);
            }
            if (choice=='f' || choice== 'F')
            {
                //Area of Rhombus
                System.out.print("Enter Length: ");
                int length = input.nextInt();
                System.out.print("Enter Diagonal: ");
                int breadth = input.nextInt();

                answer= length* breadth;
                System.out.println("Area= " + answer);
            }
            if (choice == 'g' || choice == 'G')
            {
                //Eqilateral Triangle
                System.out.print("Enter Side:- ");
                int side = input.nextInt();

                answer = (float) (Math.sqrt(3)*side*side)/4;
                System.out.println("Area= " + answer);
            }
            
            System.out.print("Continue (y/n):- ");
            int Continue= input.next().charAt(0);
            if(Continue=='Y' || Continue == 'y')
            {
                exit = 0;
            }
            else exit=1;
        }while(exit==0);
        // System.out.println("Area= " + answer);
    }
}