package Day01;

public enum Day01_Enum
{
    Januar,
    Februar,
    Maerz,
    April;

    public static void listMonth()
    {
        for (Day01_Enum eDay: values())
        {
            System.out.println(eDay);
        }
    }

}
