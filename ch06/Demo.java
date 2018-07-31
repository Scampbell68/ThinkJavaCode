import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        printGreeting("HELLO");


        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");

        int firstNumber=in.nextInt();

        System.out.println("Enter a number:");

        int secondNumber=in.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("the total is "+total);
    }

    public static void printTotal()
    {

    }
    public static void printGreeting(String greeting)
    {
        System.out.println("<<<"+ greeting + ">>>");
    }
}
