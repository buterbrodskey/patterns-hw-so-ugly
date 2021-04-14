package generators;

public interface Generator<T> {

    void generateParams(int code);

    T buildResponse();

    default T getResponse(final int code) {
        generateParams(code);
        return buildResponse();
    }
}
