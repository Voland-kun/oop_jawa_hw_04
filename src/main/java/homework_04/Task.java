package homework_04;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

abstract public class Task implements io{
    protected int id;
    protected static int count = 1;
    protected LocalDateTime addTime;
    protected LocalDateTime deadline;
    protected String fullname;
    public String comment;

    public Task (String comment, Person name) {
        this.id = count++;
        this.addTime = LocalDateTime.now();
        this.deadline = addTime.plusMinutes(1);
        this.fullname = name.getFullname();
        this.comment = comment;
    }

    protected Task() {
    }

    @Override
    public String toString() {
        return id+";"+addTime+";"+deadline+";"+fullname+";"+comment+"\n";
    }

    public void print() throws IOException {
        FileWriter fileWriter = new FileWriter("Tasks.csv", true);
        fileWriter.write(toString());
        fileWriter.flush();
    }
}
