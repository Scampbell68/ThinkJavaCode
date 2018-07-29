import java.util.Scanner;

public class CrazyEd
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What size would you like?");
        int diameter = scanner.nextInt();

        if (diameter > 3)
            System.out.println("This order is crazy and you are stupid.  We obviously don't sell that here.");

        System.out.println("How many yards would you like?");
        int length = scanner.nextInt();

        if (length > 1000)
            System.out.println("This order is crazy and you are stupid.  There's not that much cheese in Wisconsin.");
        System.out.println("Your total delivered cost is:");
        boolean price1 = diameter == 1;
        boolean shipping1 = diameter == 1;
        boolean price2 = diameter == 2;
        boolean shipping2 = diameter == 2;
        boolean price3 = diameter == 3;
        boolean shipping3 = diameter == 3;


        {
            if (price1 && length <= 50)
                System.out.println("$" + (2 * (length) + 2 * (length)));

            if (price1 && length > 50)
                System.out.println("$" + (2 * (length)));


            if (price2 && length <= 50)
                System.out.println("$" + (4 * (length) + 2 * (length)));

            if (price2 && length > 50)
                System.out.println("$" + (4 * (length)));

            if (price3 && length <= 50)
                System.out.println("$" + (6 * (length) + 4 * (length)));

            if (price3 && length > 50)
                System.out.println("$" + (6 * (length)));



           /* if (price4)
                System.out.println("This order is crazy and you are stupid.  We obviously don't sell that here.");
*/
        }
/* public static void priceperyard(int price)
    {


        switch (price)
        {
            case 1: price=2;

                System.out.println("The price of your order is:"+price*length);
            case 2: price=3;
            case 3: price=6;


        }
*/
    }


}

