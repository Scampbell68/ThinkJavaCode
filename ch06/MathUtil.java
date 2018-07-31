public class MathUtil
{
    public static void main(String[] args)
    {
        int total = getTotal(1, 2);

        System.out.println(total);
        double cargoVolume = getCargoVolume(2, 2, 2, false);
        System.out.println(cargoVolume);

        int absoluteAnswer = absoluteSum(-5, 2);
        System.out.println(absoluteAnswer);

        int absoluteAnswerTwo = absoluteSum(-5, 2, -3);
        System.out.println(absoluteAnswerTwo);

    }

    public static int getTotal(int firstNumber, int secondNumber)
    {
        int sum = firstNumber + secondNumber;

        return sum;
    }

    public static double getCargoVolume(double height, double length, double depth, boolean heavyDuty)
    {

        double materialThickness = .25;
        if (heavyDuty) ;
        materialThickness = .25 * 2;
        double interiorHeight = height - (2 * materialThickness);
        double interiorLength = length - (2 * materialThickness);
        double interiorDepth = depth - (2 * materialThickness);
        double cargoVolume = interiorHeight * interiorLength * interiorDepth;
        return cargoVolume;
    }

    public static int absoluteSum(int numberone, int numberTwo)
    {
        int absoluteOne = Math.abs(numberone);
        int absoluteTwo = Math.abs(numberTwo);
        int absoluteAnswer = absoluteOne + absoluteTwo;
        return absoluteAnswer;
    }

    public static int absoluteSum(int numberone, int numberTwo, int numberThree)
    {
        int absoluteOne = Math.abs(numberone);
        int absoluteTwo = Math.abs(numberTwo);
        int absoluteThree = Math.abs(numberThree);
        int absoluteAnswerTwo = absoluteOne + absoluteTwo + absoluteThree;
        return absoluteAnswerTwo;
    }
}
