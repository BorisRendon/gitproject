import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import static org.testng.Assert.*;

public class ListenersTest implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {
        String s = iTestResult.getMethod().getDescription();
        String testName = iTestResult.getMethod().getMethodName();
        String [] groups = iTestResult.getMethod().getGroups();
        System.out.println("description" + s+ "\n"+testName+"\n"+groups.toString());//imprimir el [] con for
    }

    public void onTestSkipped(ITestResult iTestResult) {
        //test que depende de otro
        //retry class
        String [] groups = iTestResult.getMethod().getGroupsDependedUpon();
        //RECOMENDACION: evitar el uso de dependencias
        //ctrl+shift+/ para comentar varias lineas
        //job (reporte de testing)
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}