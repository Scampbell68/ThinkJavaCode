public class Names
{
    public static void main(String[] args)
    {
        //String decoration=%%%%%%%;
        String returnValue=getMyName();

        String fancyName=getMyFancyName("%%%%%%%%");

        System.out.println(returnValue);
        System.out.println(fancyName);
    }

    public static String getMyName( )

    {
        return "Stephen";
    }
    public static String getMyFancyName(String decoration)
    {
        String fancyName = decoration +"Stephen"+decoration;
        return fancyName;
    }
}
