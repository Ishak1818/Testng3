import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest extends BeforeMethod{
    @Test(dataProvider="Provider", dataProviderClass = DataProvider2.class)
    public void DataProviderTester(String names, int phone){
        System.out.println(" the name is " + names);
        System.out.println("The Phone number is "+ phone);

    }
}
