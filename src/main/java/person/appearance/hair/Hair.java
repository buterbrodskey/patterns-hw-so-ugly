package person.appearance.hair;

public final class Hair {
    private final HairLength hairLength;
    private final String color;

    public Hair(final HairLength hairLength, final String color) {
        this.hairLength = hairLength;
        this.color = color;
    }
    @Override
    public String toString() {
        if (!hairLength.equals(HairLength.NONE)) {
            return hairLength.getLength() + ", " + color;
        } else {
            return hairLength.getLength();
        }
    }
}
