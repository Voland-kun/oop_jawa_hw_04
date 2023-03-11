package homework_04;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LowPriority extends Task {
    public LowPriority (String comment, Person name) {
        id = count++;
        addTime = LocalDateTime.now();
        deadline = addTime.plusDays(1);
        fullname = name.getFullname();
        this.comment = comment;
    }
}