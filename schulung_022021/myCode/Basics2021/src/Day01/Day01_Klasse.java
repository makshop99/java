package Day01;

public class Day01_Klasse
{
    private String sAttribute01;
    private String sAttribute02;
    private int iAttribute03;

    public void setAttributes(String s1, String s2, int i3)
    {
        sAttribute01 = s1;
        sAttribute02 = s2;
        iAttribute03 = i3;
    }

    public void setAttributes()
    {
        sAttribute01 = "initial 1";
        sAttribute02 = "initial 2";
        iAttribute03 = 0;
    }

    public void getAttributes()
    {
        System.out.println("Class Day01_Objekte, sAttribute01 = " + sAttribute01);
        System.out.println("Class Day01_Objekte, sAttribute02 = " + sAttribute02);
        System.out.println("Class Day01_Objekte, iAttribute03 = " + iAttribute03);
    }

    @Override
    public String toString() {
        return "Day01_Klasse{" +
                "sAttribute01='" + sAttribute01 + '\'' +
                ", sAttribute02='" + sAttribute02 + '\'' +
                ", iAttribute03=" + iAttribute03 +
                '}';
    }
}
