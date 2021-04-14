package person;

import generators.AppearanceGenerator;
import generators.FioGeneratorAdapter;
import generators.PhoneGenerator;
import generators.PhysGenerator;

public class PersonFactory {
    public static Person getPerson(final String input) {
        final FioGeneratorAdapter fioGenerator = new FioGeneratorAdapter();
        final PhysGenerator physGenerator = new PhysGenerator();
        final AppearanceGenerator appearanceGenerator = new AppearanceGenerator();
        final PhoneGenerator phoneGenerator = new PhoneGenerator();

        if (input.trim().matches("\\d{4}")) {

            final int intCode = Integer.parseInt(input);

            return new Person.PersonBuilder(input)
                    .setFio(fioGenerator.getResponse(intCode))
                    .setPhysical(physGenerator.getResponse(intCode))
                    .setAppearance(appearanceGenerator.getResponse(intCode))
                    .setPhone(phoneGenerator.getResponse(intCode))
                    .getPerson();
        } else {
            return null;
        }
    }
}
