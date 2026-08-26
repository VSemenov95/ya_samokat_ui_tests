package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.MainPage;
import pages.OrderPage;
import pages.RentPage;
import testData.FakerTestData;
import testData.OrderButton;

import static com.codeborne.selenide.Selenide.$;

@Owner("VSSemenov")
@Epic("Разработка страницы Для кого")
@DisplayName("Проверка заполнения полей страница Для кого")
public class FillingPageForWhomTest extends TestBase{
    MainPage mainPage = new MainPage();
    OrderPage orderPage = new OrderPage();
    RentPage rentPage = new RentPage();
    FakerTestData testData = new FakerTestData();

    @Story("Добавление полей на страницу")
    @Severity(SeverityLevel.CRITICAL)
    @EnumSource(OrderButton.class)
    @ParameterizedTest(name = "Проверка успешного заполнения страницы Для кого с переходом через кнопку Заказать = {0}")
    @DisplayName("Успешное заполнение страницы Для кого")
    public void successfulFilingPageWhomTest(OrderButton orderButton) {
        mainPage.openOrdersButton($(orderButton.getTitle()));
        orderPage.checkTitleForm();
        orderPage.setFirstName(testData.setFirstName());
        orderPage.setLastName(testData.setLastName());
        orderPage.setAddress(testData.setAddress());
        orderPage.setMetroStation(testData.setMetroStation());
        orderPage.setPhoneNumber(testData.setPhoneNumber());
        orderPage.clickNextButton();
        rentPage.checkTitleFormRent();
    }

    @Story("Добавление валидаций")
    @Severity(SeverityLevel.NORMAL)
    @EnumSource(OrderButton.class)
    @ParameterizedTest(name = "Проверка обязательности поля Имя на странице Для кого с переходом через кнопку Заказать = {0}")
    @DisplayName("Неуспешное заполнение страницы Для кого")
    public void filingPageWhomWithoutName(OrderButton orderButton) {
        mainPage.openOrdersButton($(orderButton.getTitle()));
        orderPage.checkTitleForm();
        orderPage.setLastName(testData.setLastName());
        orderPage.setAddress(testData.setAddress());
        orderPage.setMetroStation(testData.setMetroStation());
        orderPage.setPhoneNumber(testData.setPhoneNumber());
        orderPage.clickNextButton();
        orderPage.checkTitleForm();
        orderPage.checkVisibleErrorMessageForName();
        orderPage.checkErrorMessageForName("Введите корректное имя");
    }

    @Story("Добавление валидаций")
    @Severity(SeverityLevel.NORMAL)
    @EnumSource(OrderButton.class)
    @ParameterizedTest(name = "Проверка обязательности поля Фамилия на странице Для кого с переходом через кнопку Заказать = {0}")
    @DisplayName("Неуспешное заполнение страницы Для кого")
    public void filingPageWhomWithoutLastName(OrderButton orderButton) {
        mainPage.openOrdersButton($(orderButton.getTitle()));
        orderPage.checkTitleForm();
        orderPage.setFirstName(testData.setFirstName());
        orderPage.setAddress(testData.setAddress());
        orderPage.setMetroStation(testData.setMetroStation());
        orderPage.setPhoneNumber(testData.setPhoneNumber());
        orderPage.clickNextButton();
        orderPage.checkTitleForm();
        orderPage.checkVisibleErrorMessageForLastName();
        orderPage.checkErrorMessageForLastName("Введите корректную фамилию");
    }

    @Story("Добавление валидаций")
    @Severity(SeverityLevel.NORMAL)
    @EnumSource(OrderButton.class)
    @ParameterizedTest(name = "Проверка обязательности поля Станция метро на странице Для кого с переходом через кнопку Заказать = {0}")
    @DisplayName("Неуспешное заполнение страницы Для кого")
    public void filingPageWhomWithoutMetroStation(OrderButton orderButton) {
        mainPage.openOrdersButton($(orderButton.getTitle()));
        orderPage.checkTitleForm();
        orderPage.setFirstName(testData.setFirstName());
        orderPage.setLastName(testData.setLastName());
        orderPage.setAddress(testData.setAddress());
        orderPage.setPhoneNumber(testData.setPhoneNumber());
        orderPage.clickNextButton();
        orderPage.checkTitleForm();
        orderPage.checkVisibleErrorMessageForMetroStation();
        orderPage.checkErrorMessageForMetroStation("Выберите станцию");
    }

    @Story("Добавление валидаций")
    @Severity(SeverityLevel.NORMAL)
    @EnumSource(OrderButton.class)
    @ParameterizedTest(name = "Проверка обязательности поля Телефон на странице Для кого с переходом через кнопку Заказать = {0}")
    @DisplayName("Неуспешное заполнение страницы Для кого")
    public void filingPageWhomWithoutPhone(OrderButton orderButton) {
        mainPage.openOrdersButton($(orderButton.getTitle()));
        orderPage.checkTitleForm();
        orderPage.setFirstName(testData.setFirstName());
        orderPage.setLastName(testData.setLastName());
        orderPage.setAddress(testData.setAddress());
        orderPage.setMetroStation(testData.setMetroStation());
        orderPage.clickNextButton();
        orderPage.checkTitleForm();
        orderPage.checkVisibleErrorMessageForPhone();
        orderPage.checkErrorMessageForPhone("Введите корректный номер");
    }

    @Story("Добавление валидаций")
    @Severity(SeverityLevel.NORMAL)
    @EnumSource(OrderButton.class)
    @ParameterizedTest(name = "Проверка ввода латиницы в поле Имя через кнопку Заказать = {0}")
    @DisplayName("Неуспешное заполнение страницы Для кого")
    public void characterFirstNameInputValidation(OrderButton orderButton) {
        mainPage.openOrdersButton($(orderButton.getTitle()));
        orderPage.checkTitleForm();
        orderPage.setFirstName(testData.setIncorrectFirstName());
        orderPage.setLastName(testData.setLastName());
        orderPage.setAddress(testData.setAddress());
        orderPage.setMetroStation(testData.setMetroStation());
        orderPage.setPhoneNumber(testData.setPhoneNumber());
        orderPage.clickNextButton();
        orderPage.checkTitleForm();
        orderPage.checkVisibleErrorMessageForName();
        orderPage.checkErrorMessageForName("Введите корректное имя");
    }

    @Story("Добавление валидаций")
    @Severity(SeverityLevel.NORMAL)
    @EnumSource(OrderButton.class)
    @ParameterizedTest(name = "Проверка ввода латиницы в поле Имя через кнопку Заказать = {0}")
    @DisplayName("Неуспешное заполнение страницы Для кого")
    public void characterLastNameInputValidation(OrderButton orderButton) {
        mainPage.openOrdersButton($(orderButton.getTitle()));
        orderPage.checkTitleForm();
        orderPage.setFirstName(testData.setFirstName());
        orderPage.setLastName(testData.setIncorrectLastName());
        orderPage.setAddress(testData.setAddress());
        orderPage.setMetroStation(testData.setMetroStation());
        orderPage.setPhoneNumber(testData.setPhoneNumber());
        orderPage.clickNextButton();
        orderPage.checkTitleForm();
        orderPage.checkVisibleErrorMessageForName();
        orderPage.checkErrorMessageForName("Введите корректную фамилию");
    }
}
