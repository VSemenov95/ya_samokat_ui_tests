package tests.WebSteps;

import io.qameta.allure.Step;
import pages.OrderPage;
import testData.FakerTestData;

public class WebStepsOrderPage {
    OrderPage orderPage = new OrderPage();
    FakerTestData testData = new FakerTestData();

    @Step("Проверить заголовок страницы")
    public void checkTitleOrderForm() {
        orderPage.checkTitleForm();
    }

    @Step("Заполнить поле Имя")
    public void setFirstName() {
        orderPage.setFirstName(testData.setFirstName());
    }

    @Step("Заполнить поле Фамилия")
    public void setLastName() {
        orderPage.setLastName(testData.setLastName());
    }

    @Step("Заполнить поле Адрес")
    public void setAddress() {
        orderPage.setAddress(testData.setAddress());
    }

    @Step("Выбрать значение в поле Станция метро")
    public void setMetroStation(){
        orderPage.setMetroStation(testData.setMetroStation());
    }

    @Step("Заполнить поле Номер телефона")
    public void setPhoneNumber() {
        orderPage.setPhoneNumber(testData.setPhoneNumber());
    }

    @Step("Нажать кнопку Далее")
    public void pressNextButton() {
        orderPage.clickNextButton();
    }

    @Step("Проверить появление текста ошибки под полем Имя")
    public void checkVisibleErrorMessageForName(){
        orderPage.checkVisibleErrorMessageForName();
    }

    @Step("Проверить текст ошибки под полем Имя")
    public void checkErrorMessageForName() {
        orderPage.checkErrorMessageForName();
    }

    @Step("Проверить появление текста ошибки под полем Имя")
    public void checkVisibleErrorMessageForLastName(){
        orderPage.checkVisibleErrorMessageForLastName();
    }

    @Step("Проверить текст ошибки под полем Имя")
    public void checkErrorMessageForLastName() {
        orderPage.checkErrorMessageForLastName();
    }
}
