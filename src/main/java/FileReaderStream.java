import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReaderStream {
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("/Users/muks/workspace/functionalprogramming/pom.xml"))
                .filter(line->line.contains("name"));
        System.out.println(lines.findAny());
    }
}
