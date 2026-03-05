package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import testData.OrderButton;
import tests.WebSteps.WebStepsMainPage;
import tests.WebSteps.WebStepsOrderPage;
import tests.WebSteps.WebStepsRentPage;

import static com.codeborne.selenide.Selenide.$;

@DisplayName("Проверка заполнения полей страница Для кого")
public class FillingPageForWhomTest extends TestBase{
    WebStepsOrderPage webStepsOrderPage = new WebStepsOrderPage();
    WebStepsRentPage webStepsRentPage = new WebStepsRentPage();
    WebStepsMainPage webStepsMainPage = new WebStepsMainPage();

    @EnumSource(OrderButton.class)
    @ParameterizedTest(name = "Проверка успешного заполнения страницы Для кого с переходом через кнопку Заказать = {0}")
    @DisplayName("Успешное заполнение страницы Для кого")
    public void successfulFilingPageWhomTest(OrderButton orderButton) {
        webStepsMainPage.pressOrderButton($(orderButton.getTitle()));
        webStepsOrderPage.checkTitleOrderForm();
        webStepsOrderPage.setFirstName();
        webStepsOrderPage.setLastName();
        webStepsOrderPage.setAddress();
        webStepsOrderPage.setMetroStation();
        webStepsOrderPage.setPhoneNumber();
        webStepsOrderPage.pressNextButton();
        webStepsRentPage.checkTitleOrderForm();
    }

    @EnumSource(OrderButton.class)
    @ParameterizedTest(name = "Проверка обязательности поля Имя на странице Для кого с переходом через кнопку Заказать = {0}")
    @DisplayName("Неуспешное заполнение страницы Для кого")
    public void filingPageWhomWithoutName(OrderButton orderButton) {
        webStepsMainPage.pressOrderButton($(orderButton.getTitle()));
        webStepsOrderPage.checkTitleOrderForm();
        webStepsOrderPage.setLastName();
        webStepsOrderPage.setAddress();
        webStepsOrderPage.setMetroStation();
        webStepsOrderPage.setPhoneNumber();
        webStepsOrderPage.pressNextButton();
        webStepsOrderPage.checkTitleOrderForm();
        webStepsOrderPage.checkVisibleErrorMessageForName();
        webStepsOrderPage.checkErrorMessageForName();
    }

    @EnumSource(OrderButton.class)
    @ParameterizedTest(name = "Проверка обязательности поля Фамилия на странице Для кого с переходом через кнопку Заказать = {0}")
    @DisplayName("Неуспешное заполнение страницы Для кого")
    public void filingPageWhomWithoutLastName(OrderButton orderButton) {
        webStepsMainPage.pressOrderButton($(orderButton.getTitle()));
        webStepsOrderPage.checkTitleOrderForm();
        webStepsOrderPage.setFirstName();
        webStepsOrderPage.setAddress();
        webStepsOrderPage.setMetroStation();
        webStepsOrderPage.setPhoneNumber();
        webStepsOrderPage.pressNextButton();
        webStepsOrderPage.checkTitleOrderForm();
        webStepsOrderPage.checkVisibleErrorMessageForLastName();
        webStepsOrderPage.checkErrorMessageForLastName();
    }
}
