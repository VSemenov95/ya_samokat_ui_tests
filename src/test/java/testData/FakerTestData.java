package testData;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class FakerTestData {
    Faker faker = new Faker(new Locale("ru"));

    public String setFirstName() {
        return faker.name().firstName();
    }

    public String setLastName() {
        return faker.name().lastName();
    }

    public String setIncorrectFirstName() {
        Faker fakerEn = new Faker(new Locale("en"));
        return fakerEn.name().firstName();
    }

    public String setIncorrectLastName() {
        Faker fakerEn = new Faker(new Locale("en"));
        return fakerEn.name().lastName();
    }
    public String setAddress() {
        return faker.address().streetAddress();
    }

    public String setPhoneNumber() {
        return faker.phoneNumber().subscriberNumber(11);
    }

    public String setMetroStation() {
        return MetroStation.getRandomMetroStation();
    }

    public String setDateRate() {
        Date randomDate = faker.date().future(365, TimeUnit.DAYS);
        return new SimpleDateFormat("dd.MM.yyyy").format(randomDate);
    }

    public String setTimeRate() {
        return faker.options().option("сутки", "двое суток", "трое суток", "четверо суток", "пятеро суток", "шестеро суток", "семеро суток");
    }

    public String setColor() {
        return faker.options().option("чёрный жемчуг", "серая безысходность");
    }

    public String setComment() {
        return faker.lorem().sentence(10);
    }
}
