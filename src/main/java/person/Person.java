package person;

import person.appearance.Appearance;

public class Person {

    private String id;
    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

//    public Person(final PersonData personData) {
//        this.id = personData.id;
//        this.fio = personData.fio;
//        this.phys = personData.phys;
//        this.appearance = personData.appearance;
//        this.phone = personData.phone;
//    }


    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(String.format("%1$s %2$s %3$s",
                        fio.getLastName(), fio.getFirstName(), fio.getMiddleName())).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }

    public static final class PersonBuilder {
        private Person person;

        public PersonBuilder(final String id) {
            person = new Person();
            person.id = id;
        }

        public PersonBuilder setFio(final Fio fio) {
            person.fio = fio;
            return this;
        }

        public PersonBuilder setAppearance(final Appearance appearance) {
            person.appearance = appearance;
            return this;
        }

        public PersonBuilder setPhysical(final Physical physical) {
            person.phys = physical;
            return this;
        }

        public PersonBuilder setPhone(final Phone phone) {
            person.phone = phone;
            return this;
        }

        public Person getPerson() {
            return person;
        }
    }
}