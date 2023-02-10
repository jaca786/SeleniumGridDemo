package com.grid;

import org.testng.annotations.Test;

public class MainPageTest2 extends Base{

    @Test
    public void navigationToAllTools() throws InterruptedException {
        Thread.sleep(2000);
       System.out.println( driver.getTitle());
        Thread.sleep(2000);
    }

}
