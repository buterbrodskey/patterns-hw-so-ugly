package generators;

public interface Generator<T> {

    void generateParams(int code);

    T buildResponse();

    T getResponse(int code);
}
