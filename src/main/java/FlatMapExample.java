import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {

        List<Module> modules = Arrays.asList(
                new Module("ETL", 1, Arrays.asList("0001112222")),
                new Module("ETL_Hub", 2, Arrays.asList("0001113333")),
                new Module("ETL_Services", 3, Arrays.asList("0001114444"))
        );

        System.out.println("Old Imperative Way");

        for (Module module : modules) {
            System.out.println(module.toString());
        }

        System.out.println("New Way of functional programming");

        Optional<String> matchers = modules.stream()
                .map(module -> module.getPhoneNo().stream())
                .flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("0001113333")))
                .findAny();
        matchers.ifPresent(System.out::println);
        System.out.println(matchers);
    }
}