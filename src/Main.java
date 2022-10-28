import java.util.*;

public class Main {
    private static Set<String> taskList = new HashSet<>();
    private static Set<String> taskList1 = new HashSet<>();

    public static void main(String[] args) {
        Task task = new Task();


        while (taskList.size() < 15) {
            int count = 0;
            String task1 = task.getTask();
            String taskReverse = new StringBuffer(task1).reverse().toString();
            for (String str : taskList) {
                if (str.equals(taskReverse)) {
                    count++;
                }
            }
            if (count == 0) {
                taskList.add(task1);
                System.out.println(task1);
            }
        }

        System.out.println(taskList);

    }

}



