package homework_04;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person {
    public String fullname;

    public Person (String fullname) {
        this.fullname = fullname;
    }
}
