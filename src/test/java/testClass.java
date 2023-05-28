import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class testClass extends BeforeMethod {
    @Test
    public void value(){
MainJava obj = new MainJava();

int j= obj.num1(6,2,4);
        Assert.assertEquals(j,18);
        System.out.println("This is test 1");
        System.out.println();}
        @Test
                public void value2(){
        MainJava obj = new MainJava();
        int j = obj.sum(5,5);
        Assert.assertEquals(j,10);
            System.out.println("This is test 2");
            System.out.println();








    }
}
