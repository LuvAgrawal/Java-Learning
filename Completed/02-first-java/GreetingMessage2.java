import java.util.Scanner;

public class GreetingMessage2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name of the Birthday Girl:-");
        String name = input.next();
        System.out.print("Enter Age:-");
        int age = input.nextInt();

        System.out.println("Happy " + age + " Birthday " + name+"!!! 🥳");
    }
}
