package config;

public class BuildConfig {
    private final String browserName = System.getProperty("browser", "chrome");
    private final String browserSize = System.getProperty("browserSize", "1920x1080");
    private final String browserVersion = System.getProperty("browserVersion", "127");
    private final String baseUrl = System.getProperty("baseUrl", "https://qa-scooter.praktikum-services.ru/");
    private final String remoteUrl = System.getProperty("remoteUrl");

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public String getBrowserSize() {
        return browserSize;
    }

    public String getBrowserName() {
        return browserName;
    }
}