package person.appearance.hair;

public class Hair {
    public HairLength hairLength;
    public String color;
    @Override
    public String toString() {
        if (!hairLength.equals(HairLength.NONE))
            return hairLength.length +
                    ", " + color;
        else {
            return hairLength.length;
        }
    }

    public static class HairBuilder {
        private final Hair hair;
        public HairBuilder() {
            hair = new Hair();
        }

        public HairBuilder withColor(String hairColor) {
            hair.color = hairColor;
            return this;
        }

        public HairBuilder withLength(int hairLength) {
            if (hairLength > 0) {
                hair.hairLength = (hairLength > 4) ? HairLength.LONG : HairLength.SHORT;
            } else {
                hair.hairLength = HairLength.NONE;
            }
            return this;
        }

        public Hair getHair() {
            return hair;
        }
    }
}
