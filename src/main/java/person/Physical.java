package person;

public class Physical {

    private final int age;
    private final int weight;
    private final double height;

    public Physical(final int age, final int weight, final double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public final String toString() {
        //return String.format("Возраст:\t%1$s%nВес:\t\t%2$s кг%nРост:\t\t%3$s м", age, weight, height);
        return "Возраст:\t" + age + "\nВес:\t\t" +weight + " кг\nРост:\t\t"+ height +" м";
    }
}
