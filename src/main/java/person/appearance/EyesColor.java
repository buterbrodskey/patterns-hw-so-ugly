package person.appearance;

public enum EyesColor {
    BLUE("голубые"),
    GREEN("зелёные"),
    BROWN("карие"),
    GRAY("серые"),
    DIFF("разные");

    public String getColor() {
        return color;
    }

    private final String color;

    EyesColor(String color) {
        this.color = color;
    }
}
