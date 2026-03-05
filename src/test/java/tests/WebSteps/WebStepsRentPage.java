package tests.WebSteps;

import io.qameta.allure.Step;
import pages.RentPage;
import testData.FakerTestData;

public class WebStepsRentPage {
    RentPage rentPage = new RentPage();
    FakerTestData testData = new FakerTestData();

    @Step("Проверить заголовок страницы")
    public void checkTitleOrderForm() {
        rentPage.checkTitleFormRent();
    }

    @Step("Заполнить поле Когда привезти самокат")
    public void setDateRate() {
        rentPage.setDateRate(testData.setDateRate());
    }

    @Step("Заполнить поле Срок аренды")
    public void setTimeRate() {
        rentPage.setTimeRate(testData.setTimeRate());
    }

    @Step("Выбрать цвет самоката")
    public void setColor() {
        rentPage.setColorCheckBox(testData.setColor());
    }

    @Step("Оставить комментарий для курьера")
    public void setComment() {
        rentPage.setCommentForСourier(testData.setComment());
    }

    @Step("Нажать кнопку Заказать")
    public void clickOrderButton() {
        rentPage.clickOrderButton();
    }

    @Step("Нажать кнопку Назад")
    public void clickBackButton() {
        rentPage.clickBackButton();
    }
}
