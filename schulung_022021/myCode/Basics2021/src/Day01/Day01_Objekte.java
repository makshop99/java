package Day01;

public class Day01_Objekte
{
    public static void main(String[] args)
    {
        Day01_Klasse oInstanz = new Day01_Klasse();

        oInstanz.setAttributes("String 1", "String 2", 3);
        oInstanz.getAttributes();

        oInstanz.setAttributes();
        oInstanz.getAttributes();

        // toString()
        System.out.println(oInstanz);
    }
}
