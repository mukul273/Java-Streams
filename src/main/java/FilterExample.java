import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class FilterExample {

    public static void main(String[] args) {

        List<String> modules = Arrays.asList("ETL","ETL-Hub","ETL-Services","Yakback");

       log.info("Old Imperative Way");

        for (String module : modules) {
            if(module.equalsIgnoreCase("etl"))
                log.info(module);
        }

        log.info("New Way of functional programming");

        modules.stream()
                .filter(module -> module.equalsIgnoreCase("etl"))
                .forEach(log::info);
            // Filters the module array based on the condition, assigns the temp variable to the 
            // filtered and returns matched array element (string) 
            // forEach represents the holder for log/sysout
    }
}
