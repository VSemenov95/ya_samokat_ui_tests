package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RentPage {
    private final SelenideElement
            dateRatePicker = $("#Input_Input__1iN_Z Input_Responsible__1jDKN Input_Filled__1rDxs"),
            timeRateDropdown = $("#Dropdown-control"),
            colorCheckBox = $("#Order_Checkboxes__3lWSI"),
            commentForСourierInput = $("#Input_Input__1iN_Z Input_Responsible__1jDKN"),
            backButton = $("#Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i"),
            orderButon = $("#Button_Button__ra12g Button_Middle__1CSJM"),
            titleFormRent = $(".Order_Header__BZXOb"),
            modalWindowButtonYes = $("#Button_Button__ra12g Button_Middle__1CSJM"),
            modalWindowButtonNo = $("#Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i");

        public void checkTitleFormRent() {
            titleFormRent.shouldHave(text("Про аренду"));

        }

        public void setDateRate(String value) {
            dateRatePicker.setValue(value);
        }

        public RentPage setTimeRate(String value) {
            timeRateDropdown.setValue(value);
            return this;
        }

        public RentPage setColorCheckBox(String value) {
            colorCheckBox.setValue(value);
            return this;
        }

        public RentPage setCommentForСourier(String value) {
            commentForСourierInput.setValue(value);
            return this;
        }

        public void clickBackButton() {
            backButton.click();
        }

        public void clickOrderButton() {
            orderButon.click();
        }

        public void clickModalWindowButtonYes() {
            modalWindowButtonYes.click();
        }

    public void clickModalWindowButtonNo() {
        modalWindowButtonNo.click();
    }
}
