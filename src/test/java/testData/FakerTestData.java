package testData;

import com.github.javafaker.Faker;

import java.util.Locale;

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
}
