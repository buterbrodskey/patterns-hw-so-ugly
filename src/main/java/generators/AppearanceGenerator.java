package generators;

import person.appearance.Appearance;
import person.appearance.EyesColor;
import person.appearance.hair.Hair;

import java.util.HashMap;

public class AppearanceGenerator implements Generator<Appearance> {

    private String eyes;
    private int hairLength;
    private String hairColor;

    private final HashMap<Integer, String> hairColorMap = new HashMap<>() {{
        put(1, "чёрные");
        put(2, "каштановые");
        put(3, "рыжие");
        put(4, "светлые");
        put(5, "седые");
        put(6, "розовые");
        put(7, "зелёные");
        put(8, "фиолетовые");
        put(9, "синие");
    }};

    @Override
    public Appearance getResponse(final int code) {
        generateParams(code);
        return buildResponse();
    }

    /**
     * Внешность генерируется по третьей цифре кода (i):
     * Глаза: по индексу i/2 (=0..4)
     * Длина волос: i
     * Цвет волос: из enum по индексу i-1 при i>0 (=0..8).
     */
    @Override
    public final void generateParams(final int code) {
        final int i = code % 100 / 10;
        generateEyes(i);
        generateHairColor(i);
        hairLength = i;

    }

    private void generateHairColor(int i) {
        if (i > 0) {
            hairColor = hairColorMap.get(i);
        }
    }

    private void generateEyes(int i) {
        switch (i / 2) {
            case 0:
                eyes = EyesColor.BLUE.getColor();
                break;
            case 1:
                eyes = EyesColor.GREEN.getColor();
                break;
            case 2:
                eyes = EyesColor.BROWN.getColor();
                break;
            case 3:
                eyes = EyesColor.GRAY.getColor();
                break;
            case 4:
                eyes = EyesColor.DIFF.getColor();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i / 2);
        }
    }

    @Override
    public final Appearance buildResponse() {
        Hair hair = new Hair.HairBuilder()
                .withColor(hairColor)
                .withLength(hairLength)
                .getHair();

        return new Appearance(eyes, hair);
    }
}

