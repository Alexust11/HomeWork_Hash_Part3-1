import java.util.*;

public class Main {
    private static Set<String> taskList = new HashSet<>();
    private static Random random=new Random();

    public static void main(String[] args) {


        while (taskList.size() < 15) {
            Integer n1=random.nextInt(2,9);
            Integer n2=random.nextInt(2,9);
            Task task=new Task(n1, n2);
            taskList.add(task.toString());
            task.toString();
        }

        System.out.println(taskList);

    }

}



