import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekAndSkipStream {
    public static void main(String[] args) {

        //Peeking inside the module before collecting
        List<String> collect = Stream.of("Etl", "Etl-services", "Etl-Hub")
                .filter(module -> module.contains("Etl"))
                .peek(System.out::println)
                .collect(Collectors.toList());

        //Skipping the values
        IntStream.of(00, 01,02,26,27)
                .skip(1)
                .filter(i -> i > 0)
                .forEach(System.out::println);

    }
}
