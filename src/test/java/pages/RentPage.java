package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RentPage {
    private final SelenideElement
        titleFormRent = $(".Order_Header__BZXOb");

    @Step("Проверить заголовок Страницы")
    public void checkTitleFormRent() {
        titleFormRent.shouldHave(text("Про аренду"));
        }
}
