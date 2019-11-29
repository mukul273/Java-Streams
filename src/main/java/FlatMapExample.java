import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {

        List<String> modules = Arrays.asList("ETL","ETl-Hub","ETL-Services","Yakback");

        System.out.println("Old Imperative Way");

        for (String module : modules) {
            if(module.equalsIgnoreCase("etl"))
                System.out.println(module);
        }

        System.out.println("New Way of functional programming");

        modules.stream()
                .filter(module -> module.equalsIgnoreCase("etl"))
                .forEach(System.out::println);
    }
}
