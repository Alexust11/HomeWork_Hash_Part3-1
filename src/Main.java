import java.util.*;

public class Main {
    private static Set <String> taskList=new HashSet<>();
    private static Set <String> taskList1=new HashSet<>();
    private static Random number1 = new Random();
    private static Random number2 = new Random();
    private static String task;
    private static String taskReverse;
    public static void main(String[] args) {

        while (taskList.size() < 15) {
            formTask();

        }
        getTask();



    }

    private static void getTask() {
        Iterator<String> it = taskList.iterator();
        while (it.hasNext()) {
            String n = it.next();
            System.out.println(n);
        }

    }

    private static void   formTask() {
             task=number1.nextInt(2,9)+"*"+number2.nextInt(2,9);
             taskReverse=new StringBuffer(task).reverse().toString();
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