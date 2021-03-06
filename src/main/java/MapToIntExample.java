import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntExample {

    public static void main(String[] args) {

        List<String> modules = Arrays.asList("ETL","ETl-Hub","ETL-Services","Yakback");

        modules.stream()
                .map(User::new)
                .forEach(System.out::println);

        //the filtered list from above
        modules.stream()
                .filter(module -> module.equalsIgnoreCase("etl"))
                .map(User::new)
                .forEach(System.out::println);

        //Collects the filtered list from above and making another object
        List<User> moduleNames = modules.stream()
                .filter(module -> !module.equalsIgnoreCase("etl"))
                .map(User::new)
                .collect(Collectors.toList());

        //Returns the int value and sums it up.
        int allPositions = moduleNames.stream()
                .mapToInt(User::getPlaceNo)
                .sum();

        System.out.println(allPositions);
    }
}
