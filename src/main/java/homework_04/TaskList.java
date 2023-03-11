package homework_04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TaskList<T> implements io {
    private ArrayList<T> tasklist = new ArrayList<>();

    public ArrayList<T> getTasklist() {
        return tasklist;
    }

    public void append(T a) {
        tasklist.add(a);
    }

    public void print() throws IOException {
        FileWriter fileWriter = new FileWriter("Tasks.csv", true);
        for (T task : tasklist) {
            fileWriter.write(String.valueOf(task));
        }
        fileWriter.flush();
    }
}
