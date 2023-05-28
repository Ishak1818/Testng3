import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BeforeMethod {
    @org.testng.annotations.BeforeMethod
    public void BeforeMethod (){
        System.out.println("Before you run your test, run this before every method");
    }
    @AfterMethod
    public void AfterMothod(){
        System.out.println("After your run your test, run this after every method");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before every class make sure you run this method");
    }
        @AfterClass
                public void AfterClass(){
            System.out.println("After each class, make sure that you run this method");

        }

}
