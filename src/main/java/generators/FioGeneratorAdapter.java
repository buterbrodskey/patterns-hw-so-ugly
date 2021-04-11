package generators;

import person.Fio;

public class FioGeneratorAdapter implements Generator<Fio> {
    FioGenerator fioGenerator;
    Fio fio;

    @Override
    public void generateParams(int code) {
        fioGenerator = new FioGenerator();
        fio = new Fio();
        fioGenerator.generateParams(code);
        fio.firstName = fioGenerator.getFirstName();
        fio.lastName = fioGenerator.getLastName();
        fio.middleName = fioGenerator.getMiddleName();
    }

    @Override
    public Fio getResponse(int code) {
        generateParams(code);
        return buildResponse();
    }

    @Override
    public Fio buildResponse() {
        return fio;

    }
}
