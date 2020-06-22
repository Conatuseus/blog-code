package constructors;

public class JavaC {

    private final String name;

    public JavaC(String nameParam) {
        if (nameParam.isEmpty()) {
            throw new IllegalArgumentException("Error");
        }
        this.name = nameParam;
    }

    // getter
}
