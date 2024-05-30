package testng.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = "smoke")
    public void verifyNewHomeLogin(){
        Assert.assertTrue(false);
        System.out.println("New Home Page Login");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyLMS(){
        System.out.println("Loan Management System");
    }

    @Test(enabled = true)
    public void verifyCardManagementSystem(){
        System.out.println("Verify Card management System");
    }
}
