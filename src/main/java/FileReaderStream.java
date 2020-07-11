import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderStream {
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("/Users/muks/workspace/functionalprogramming/pom.xml"))
                .filter(line->line.contains("name"));
        //Above line reads the file in streams way and if it finds matching string then it assigns itself
        //with the outcome of the evaluation result and return it.

        //Below findany() is used for getting the lines contents and send it to printer.This return optional object
        // ot nullpointerexcpetion if teh stream  is null OR empty of stream is empty
        System.out.println(lines.findAny());
        System.out.println(lines.toString());

    }
}
