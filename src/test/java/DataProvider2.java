import org.testng.annotations.DataProvider;

public class DataProvider2 {


    @DataProvider (name="Provider")

    public Object[][] DataProvider(){
        Object[][] names = new Object[3][2];
        names[0][0] = "Ishak";
        names[0][1] = 348272;
        names[1][0] = "Ishak";
        names[1][1] = 52852;
        names[2][0] = "Ishak";
        names[2][1] = 7274412;
       // System.out.println(names);
        return names;

    } } ;
