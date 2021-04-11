package person.appearance.hair;

public enum HairLength {
    LONG("длинные"),
    SHORT("короткие"),
    NONE("нет");

    String length;

    HairLength(String length) {
        this.length = length;
    }
}
