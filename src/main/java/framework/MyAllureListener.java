package framework;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyAllureListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenShooter.takeScreenShot(result.getName());
    }
}
