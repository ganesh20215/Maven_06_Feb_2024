package testng.priority;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.failtestscriptexecution.RetryFailScripts;

public class PriorityExample {

    @Test(priority = -1)
    public void priorityDemo_Z(){
        System.out.println("priorityDemo_Z");
        Assert.assertTrue(false);
    }

    @Test
    public void priorityDemo_F(){
        System.out.println("priorityDemo_F");
    }

    @Test(priority = 'A')
    public void priorityDemo_N(){
        System.out.println("priorityDemo_N");
    }

    @Test(priority = 4)
    public void priorityDemo_I(){
        System.out.println("priorityDemo_I");
    }

    @Test(priority = 5)
    public void priorityDemo_H(){
        System.out.println("priorityDemo_H");
    }

    @Test(priority = 6)
    public void priorityDemo_A(){
        System.out.println("priorityDemo_A");
    }

    @Test(priority = -7)
    public void priorityDemo_Y(){
        Assert.assertTrue(false);
        System.out.println("priorityDemo_Y");
    }
}
