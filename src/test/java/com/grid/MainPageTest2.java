package com.grid;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;
import org.testng.annotations.Test;

import java.util.Optional;

public class MainPageTest2 extends Base{

    @Test
    public void navigationToAllTools() throws InterruptedException {
        DevTools devTools = ((HasDevTools) driver).getDevTools();
        devTools.createSession();

        devTools.send(Emulation.setGeolocationOverride(Optional.of(52.5043),
                Optional.of(13.4501),
                Optional.of(1)));

        driver.get("https://my-location.org/");
        System.out.println("Script Executed");
        Thread.sleep(2000);
       System.out.println( driver.getTitle());
        Thread.sleep(2000);
    }

}
