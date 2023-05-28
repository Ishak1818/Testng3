import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {
    public void onTestStart (ITestResult tr){
        System.out.println("Test Started");
        System.out.println("Test name is "+tr);
    }
    public void onTestFailure (ITestResult tr){
        System.out.println("This test failed");
        System.out.println("The name of this test "+tr.getName());
    }
    public void onTestSuccess(ITestResult tr){
        System.out.println("This test has passed ");
        System.out.println("The name of this test is "+tr.getName());
    }

}
