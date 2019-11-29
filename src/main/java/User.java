import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class User {

    public User(String name) {
        this.name = name;
    }

    private String name;
    private int placeNo = 1;

    @Override
    public String toString() {
        return "name:"+name;
    }
}
