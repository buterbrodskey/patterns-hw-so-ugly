package person;

import person.appearance.Appearance;

public class Person {

    private final String id;
    private final Fio fio;
    private final Physical phys;
    private final Appearance appearance;
    private final Phone phone;

    public Person(PersonData personData) {
        this.id = personData.id;
        this.fio = personData.fio;
        this.phys = personData.phys;
        this.appearance = personData.appearance;
        this.phone = personData.phone;
    }


    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(String.format("%1$s %2$s %3$s", fio.lastName, fio.firstName, fio.middleName)).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }
}