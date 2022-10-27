package logger;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        Log.info(result.getMethod().getMethodName() + " Started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Log.info(result.getMethod().getMethodName()+" Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Log.info("Failed because of - " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Log.info("Skipped because of -> " + result.getThrowable());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    @Override
    public void onStart(ITestContext context) {
        Log.info("============== Start " + context.getName()+ "================");
    }

    @Override
    public void onFinish(ITestContext context) {
        Log.info("============== Finish " + context.getName()+ "================");
    }
}
