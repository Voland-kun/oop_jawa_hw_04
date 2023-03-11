package homework_04;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class HighPriority extends Task {
    public HighPriority (String comment, Person name) {
        id = count++;
        addTime = LocalDateTime.now();
        deadline = addTime.plusMinutes(5);
        fullname = name.getFullname();
        this.comment = comment;
    }
}

