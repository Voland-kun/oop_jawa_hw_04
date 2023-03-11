package homework_04;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class NormalPriority extends Task{
    public NormalPriority (String comment, Person name) {
        id = count++;
        addTime = LocalDateTime.now();
        deadline = addTime.plusHours(1);
        fullname = name.getFullname();
        this.comment = comment;
    }
}
