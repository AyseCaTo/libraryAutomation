package com.libraryCT.pages;


import com.libraryCT.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardTitle;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksTitle;

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
    public WebElement accountHolderName;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement logout;

    public void logOut(){
        accountHolderName.click();
        logout.click();
    }


}
