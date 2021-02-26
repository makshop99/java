package Day01;

// Beispiel fuer Exception Handling
public class Day01_Exceptions
{
    public static void main(String[] args)
    {
        System.out.println("program started");

        try
        {
            System.out.println("Result = " + divideNumbers(5, 0));
        }

        catch (Exception exp)
        {
            exp.printStackTrace();
            System.out.println("Error : " + exp.getMessage());
        }

        finally
        {
            System.out.println("program ended");
        }
    }

    private static int divideNumbers(int iValue1, int iValue2)
    {
        return iValue1 / iValue2;
    }
}
