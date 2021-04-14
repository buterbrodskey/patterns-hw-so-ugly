import person.Person;
import person.PersonFactory;
public class InputProcessor {

    public final String processInput(final String input) {
        String result;
        Person person = PersonFactory.getPerson(input);
        if (person == null) {
            result = "Неверный ввод.";
        } else {
            result = person.toString();
        }
        return result;
    }
}
