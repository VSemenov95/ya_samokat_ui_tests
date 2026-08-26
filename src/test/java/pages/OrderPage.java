package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class OrderPage {
    private final SelenideElement
            firstNameInput = $("input.Input_Input__1iN_Z[placeholder*='Имя']"),
            errorMessageForName = $(".Input_ErrorMessage__3HvIb.Input_Visible___syz6"),
            errorMessageForLastName = $(".Input_ErrorMessage__3HvIb.Input_Visible___syz6"),
            errorMessageForMetroStation = $(".Order_MetroError__1BtZb"),
            errorMessageForPhone = $(".Input_ErrorMessage__3HvIb.Input_Visible___syz6"),
            lastNameInput = $("input.Input_Input__1iN_Z[placeholder*='Фамилия']"),
            addressInput = $("input.Input_Input__1iN_Z[placeholder*='Адрес: куда привезти заказ']"),
            metroStationDropDown = $("input.select-search__input[placeholder*='Станция метро']"),
            firstSearchElementMetroStation = $("[data-index='0']"),
            phoneNumberInput = $("input.Input_Input__1iN_Z[placeholder*='Телефон: на него позвонит курьер']"),
            nextButton = $x("//button[text()='Далее']"),
            titleForm = $(".Order_Header__BZXOb");

    @Step("Проверить заголовок страницы")
    public void checkTitleForm() {
        titleForm.shouldHave(Condition.text("Для кого самокат"));
    }

    @Step("Заполнить поле Имя")
    public void setFirstName(String value) {
        firstNameInput.setValue(value);
    }

    @Step("Проверить наличие ошибки под незаполненным полем Имя")
    public void checkVisibleErrorMessageForName(){
        errorMessageForName.shouldBe(visible);
    }

    @Step("Проверить текст ошибки под незаполненным полем Станция метро")
    public void checkErrorMessageForMetroStation(String expectedErrorText) {
        errorMessageForMetroStation.shouldHave(Condition.text(expectedErrorText));
    }

    @Step("Проверить наличие ошибки под незаполненным полем Станция метро")
    public void checkVisibleErrorMessageForMetroStation(){
        errorMessageForMetroStation.shouldBe(visible);
    }


    @Step("Проверить текст ошибки под незаполненным полем Имя")
    public void checkErrorMessageForName(String expectedErrorText) {
        errorMessageForName.shouldHave(Condition.text(expectedErrorText));
    }

    @Step("Заполнить поле Фамилия")
    public void setLastName(String value) {
        lastNameInput.setValue(value);
    }

    @Step("Проверить наличие ошибки под незаполненным полем Фамилия")
    public void checkVisibleErrorMessageForLastName(){
        errorMessageForLastName.shouldBe(visible);
    }

    @Step("Проверить текст ошибки под незаполненным полем Фамилия")
    public void checkErrorMessageForLastName(String expectedErrorText) {
        errorMessageForLastName.shouldHave(Condition.text(expectedErrorText));
    }

    @Step("Заполнить поле Адрес")
    public void setAddress(String value) {
        addressInput.setValue(value);
    }

    @Step("Заполнить поле Станция метро")
    public void setMetroStation(String value) {
        metroStationDropDown.setValue(value);
        firstSearchElementMetroStation.click();
    }

    @Step("Заполнить поле Номер телефона")
    public void setPhoneNumber(String value) {
        phoneNumberInput.setValue(value);
    }

    @Step("Нажать кнопку Далее")
    public void clickNextButton() {
        nextButton.click();
    }

    @Step("Проверить наличие ошибки под незаполненным полем Телефон")
    public void checkVisibleErrorMessageForPhone(){
        errorMessageForPhone.shouldBe(visible);
    }

    @Step("Проверить текст ошибки под незаполненным полем Телефон")
    public void checkErrorMessageForPhone(String expectedErrorText) {
        errorMessageForPhone.shouldHave(Condition.text(expectedErrorText));
    }

}