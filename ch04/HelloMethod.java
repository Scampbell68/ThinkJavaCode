import java.sql.SQLOutput;

public class HelloMethod
{
    public static void main(String[] args)
    {
        String firstName = "Fred ";
        String secondName = "Wilma ";
        String thirdName = "Pebbles";
        String lastName = "Flintstone";
        printHelloWorld(firstName, lastName);
        printHelloWorld(secondName, lastName);
        printHelloWorld(thirdName, lastName);
        printOhNo();
    }

    public static void printHelloWorld(String fname, String lName)
    {
        System.out.println("Hello World " + fname + lName);
    }

    public static void printOhNo()
    {
        System.out.println("Oh No !!!!!!!!!!");

    }

    public static void printNumberNoSign(int number)
    {

    }


}

