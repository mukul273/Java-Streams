import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Module {

    private String name;
    private Integer contribution;
    private List<String> phoneNo;

    @Override
    public String toString() {
        return "name:"+name;
    }
}
