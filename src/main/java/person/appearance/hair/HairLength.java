package person.appearance.hair;

public enum HairLength {
    LONG("длинные"),
    SHORT("короткие"),
    NONE("нет");

    private String length;
    public String getLength() {
        return length;
    }

    HairLength(final String length) {
        this.length = length;
    }
}
