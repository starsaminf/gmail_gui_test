/*
 *  Copyright (c) 2019 Jalasoft.
 *
 *  This software is the confidential and proprietary information of Jalasoft.
 *  ("Confidential Information"). You shall not disclose such Confidential
 *  Information and shall use it only in accordance with the terms of the
 *  license agreement you entered into with Jalasoft.
 *
 */

package trello.webelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import trello.page.BasePage;
import trello.page.OrganizationPage;

public class OrganizationInvitePopup extends BasePage {
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(linkText));
    }

    @FindBy(css = ".eg0KI5SqghoOFd")
    private WebElement linkText;

    public OrganizationPage clickOnLinkText() {
        linkText.click();
        return new OrganizationPage();
    }
}
