package application;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {

        protected WebDriver webDriver;

        public AbstractPage(WebDriver webDriver){

            this.webDriver = webDriver;
        }

}
