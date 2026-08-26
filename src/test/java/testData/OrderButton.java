package testData;

public enum OrderButton {
    TOP("button.Button_Button__ra12g"),
    MIDDLE(".Button_Button__ra12g.Button_Middle__1CSJM");

    public String getTitle() {
        return title;
    }

    private String title;

     OrderButton(String title) {
        this.title = title;
    }


}
