package testData;

import java.util.concurrent.ThreadLocalRandom;

public enum MetroStation {
    BULVAR_ROKOSOVSKOGO("Бульвар Рокосовского"),
    CHERKIZOVSKAYA("Черкизовская"),
    PREOBRAZHENSKAYA_PLOSHAD("Преображенская площадь"),
    SOKOLNIKI("Сокольники"),
    KOMSOMOLSKAYA("Комсомольская");

    private String title;

    MetroStation(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static String getRandomMetroStation() {
        MetroStation[] metroStations = values();
        return metroStations[ThreadLocalRandom.current().nextInt(metroStations.length)].getTitle();
    }
}
