package gmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddBoardPopup extends BasePage {

    @FindBy(css = ".\\_23NUW98LaZfBpQ")
    private WebElement txb_boardTitle;

    @FindBy(css = ".\\_3UeOvlU6B5KUnS")
    private WebElement btn_boardCreate;

    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }

    public BoardPage createBoard(String boardTitle) {
        webDriverWait.until(ExpectedConditions.visibilityOf(txb_boardTitle));
        txb_boardTitle.sendKeys(boardTitle);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(btn_boardCreate));
        btn_boardCreate.click();

        return new BoardPage();
    }
}
