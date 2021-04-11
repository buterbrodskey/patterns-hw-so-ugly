package person;

import generators.AppearanceGenerator;
import generators.FioGeneratorAdapter;
import generators.PhoneGenerator;
import generators.PhysGenerator;

public class PersonFactory {
    public static Person getPerson(String input) {
        final FioGeneratorAdapter fioGenerator = new FioGeneratorAdapter();
        final PhysGenerator physGenerator = new PhysGenerator();
        final AppearanceGenerator appearanceGenerator = new AppearanceGenerator();
        final PhoneGenerator phoneGenerator = new PhoneGenerator();

        if (input.trim().matches("\\d{4}")) {
            PersonData personData = new PersonData(input);

            final int intCode = Integer.parseInt(input);

            personData.fio = fioGenerator.getResponse(intCode);

            personData.phys = physGenerator.getResponse(intCode);

            personData.appearance = appearanceGenerator.getResponse(intCode);

            if (!input.equals(new StringBuilder(input).reverse().toString())) {
                personData.phone = phoneGenerator.getResponse(intCode);
            }

            return new Person(personData);
        }
        else {
            return null;
        }
    }
}
