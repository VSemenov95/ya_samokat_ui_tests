package tests.WebSteps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.MainPage;

public class WebStepsMainPage {
    MainPage mainPage = new MainPage();

    @Step("Нажать кнопку Заказать")
    public void pressOrderButton(SelenideElement value) {
        mainPage.openOrdersButton(value);
    }
}
