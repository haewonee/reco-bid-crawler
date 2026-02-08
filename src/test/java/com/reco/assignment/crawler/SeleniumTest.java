package com.reco.assignment.crawler;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class SeleniumTest {

        @Test
        void simpleCrawlingTest() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*"); // 최신 크롬 브라우저 호환성 문제 방지

            WebDriver driver = new ChromeDriver(options);

            try {
                driver.get("https://www.google.com");

                System.out.println("현재 페이지 제목: " + driver.getTitle());
                assertNotNull(driver.getTitle());

                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                driver.quit();
            }
        }
}
