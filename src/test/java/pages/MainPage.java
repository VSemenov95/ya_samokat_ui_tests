package pages;

import com.codeborne.selenide.SelenideElement;
import testData.OrderButton;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    OrderButton orderButton;

    public void openOrdersButton(SelenideElement value) {
        open("");
        $(value).scrollIntoView(true);
        value.click();
    }
}
