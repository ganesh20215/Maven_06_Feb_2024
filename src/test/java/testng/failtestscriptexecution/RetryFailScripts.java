package testng.failtestscriptexecution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailScripts implements IRetryAnalyzer {

    public static int RETRY_MIN = 0;
    public static final int RETRY_MAX = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (RETRY_MIN < RETRY_MAX) {
            RETRY_MIN++;
            return true;
        }
        return false;
    }
}
