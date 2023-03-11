package homework_04;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskList<Task> shedule = new TaskList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Представьтесь:");
        String username = sc.nextLine();
        Person user = new Person(username);
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Выберите приоритет задачи");
            System.out.println(" 1 - высокий приоритет \n 2 - средний приоритет \n 3 - низкий приоритет \n 4 - выход ");
            try {
                int userNumb = Integer.parseInt(userInput.next());
                switch (userNumb) {
                    case 1:
                        String comment = taskAdd();
                        HighPriority temp1 = new HighPriority(comment, user);
                        shedule.append(temp1);
                        temp1.print();
                        break;
                    case 2:
                        comment = taskAdd();
                        NormalPriority temp2 = new NormalPriority(comment, user);
                        shedule.append(temp2);
                        temp2.print();
                        break;
                    case 3:
                        comment = taskAdd();
                        LowPriority temp3 = new LowPriority(comment, user);
                        shedule.append(temp3);
                        temp3.print();
                        break;
                    case 4:
                        System.out.println("Программа завершена.");
                        System.exit(0);
                    default:
                        System.out.println("Введите корректный номер.");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Введите корректный номер.");
            }
        }
    }

    public static String taskAdd() {
        Scanner userComment = new Scanner(System.in);
        System.out.println("Введите текст задачи");
        String comment = userComment.nextLine();
        return comment;
    }
}