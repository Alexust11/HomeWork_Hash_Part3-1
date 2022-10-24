import java.util.*;

public class Main {
    private static Set <String> taskList=new HashSet<>();
    private static Set <String> taskList1=new HashSet<>();
    private static Random number1 = new Random();
    private static Random number2 = new Random();
    private static String task;
    private static String taskReverse;
    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {

            formTask();


        }
        System.out.println("прямой "+taskList);


    }
    private static void   formTask() {

             task=number1.nextInt(2,9)+"*"+number2.nextInt(2,9);
             taskReverse=new StringBuffer(task).reverse().toString();
        for (String str:taskList ) {
            if (task.equals(str)) {
                System.out.println("**********---"+task);
            }
        }

        Iterator<String> it = taskList.iterator();
        while (it.hasNext()) {
            String n = it.next();
            if (taskReverse.equals(n)) {
                it.remove();
            }
        }
             taskList.add(task);

    }







}