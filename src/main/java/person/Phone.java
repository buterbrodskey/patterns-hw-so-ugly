package person;

public class Phone {

    private final String number;

    public Phone(final String number) {
        this.number = number;
    }

    @Override
    public final String toString() {
        return number == null ? "Телефона нет" : "Телефон:" + "\t" + number;
    }
}
