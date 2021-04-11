package person;

import person.appearance.Appearance;

public class PersonData {
    public String id;
    public Fio fio;
    public Physical phys;
    public Appearance appearance;
    public Phone phone;

    public PersonData(String id) {
        this.id = id;
    }
}
