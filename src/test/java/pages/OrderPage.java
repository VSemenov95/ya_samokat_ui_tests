package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class OrderPage {
    private final SelenideElement
            firstNameInput = $("input.Input_Input__1iN_Z[placeholder*='Имя']"),
            errorMessageForName = $(".Input_ErrorMessage__3HvIb.Input_Visible___syz6"),
            errorMessageForLastName = $(".Input_ErrorMessage__3HvIb.Input_Visible___syz6"),
            lastNameInput = $("input.Input_Input__1iN_Z[placeholder*='Фамилия']"),
            addressInput = $("input.Input_Input__1iN_Z[placeholder*='Адрес: куда привезти заказ']"),
            metroStationDropDown = $("input.select-search__input[placeholder*='Станция метро']"),
            firstSearchElementMetroStation = $("[data-index='0']"),
            phoneNumberInput = $("input.Input_Input__1iN_Z[placeholder*='Телефон: на него позвонит курьер']"),
            nextButton = $("button.Button_Button__ra12g.Button_Middle__1CSJM"),
            titleForm = $(".Order_Header__BZXOb");


    public void checkTitleForm() {
        titleForm.shouldHave(Condition.text("Для кого самокат"));
    }



    public void setFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void checkVisibleErrorMessageForName(){
        errorMessageForName.shouldBe(visible);
    }

    public void checkErrorMessageForName() {
        errorMessageForName.shouldHave(Condition.text("Введите корректное имя"));
    }

    public void setLastName(String value) {
        lastNameInput.setValue(value);
    }

    public void checkVisibleErrorMessageForLastName(){
        errorMessageForLastName.shouldBe(visible);
    }

    public void checkErrorMessageForLastName() {
        errorMessageForLastName.shouldHave(Condition.text("Введите корректную фамилию"));
    }

    public void setAddress(String value) {
        addressInput.setValue(value);
    }

    public void setMetroStation(String value) {
        metroStationDropDown.setValue(value);
        firstSearchElementMetroStation.click();
    }

    public void setPhoneNumber(String value) {
        phoneNumberInput.setValue(value);
    }

    public void clickNextButton() {
        nextButton.click();
    }

}