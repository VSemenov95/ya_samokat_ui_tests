package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    SelenideElement cookieButtonConfirm = $("button.App_CookieButton__3cvqF");

    @Step("Нажать кнопку Заказать")
    public void openOrdersButton(SelenideElement value) {
        open("");
        cookieButtonConfirm.scrollIntoView(true);
        cookieButtonConfirm.click();
        $(value).scrollIntoView(true);
        value.click();
    }
}
